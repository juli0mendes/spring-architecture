package io.github.juli0mendes.springarchitecture.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private final TodoRepository repository;

    public TodoService(final TodoRepository repository) {
        this.repository = repository;
    }

    public TodoEntity save(TodoEntity entity) {
        return this.repository.save(entity);
    }

    public void update(TodoEntity entity) {
        this.repository.save(entity);
    }

    public TodoEntity findById(Integer id) {
        return this.repository.findById(id).orElse(null);
    }
}
