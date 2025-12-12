package io.github.juli0mendes.springarchitecture.todos;

import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    private final TodoRepository repository;

    public TodoValidator(final TodoRepository repository) {
        this.repository = repository;
    }

    public void validate(TodoEntity entity) {
        if (this.descriptionMustBeUnique(entity)) {
            throw new IllegalArgumentException("Description must be unique");
        }
    }

    private boolean descriptionMustBeUnique(TodoEntity entity) {
        return this.repository.existsByDescription(entity.getDescription());
    }
}
