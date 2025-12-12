package io.github.juli0mendes.springarchitecture.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private final TodoRepository repository;
    private final TodoValidator validator;
    private final MailSender mailSender;

    public TodoService(final TodoRepository repository,
                       final TodoValidator validator,
                       final MailSender mailSender) {
        this.repository = repository;
        this.validator = validator;
        this.mailSender = mailSender;
    }

    public TodoEntity save(TodoEntity entity) {
        this.validator.validate(entity);
        return this.repository.save(entity);
    }

    public void update(TodoEntity entity) {
        this.repository.save(entity);
        var status = entity.getDone() == Boolean.TRUE ? "done" : "not done";
        this.mailSender.send("Todo updated: " + entity.getDescription() + " was " + status);
    }

    public TodoEntity findById(Integer id) {
        return this.repository.findById(id).orElse(null);
    }
}
