package io.github.juli0mendes.springarchitecture;

import io.github.juli0mendes.springarchitecture.todos.TodoEntity;
import io.github.juli0mendes.springarchitecture.todos.TodoRepository;
import io.github.juli0mendes.springarchitecture.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_SINGLETON;

@Component
@Scope(SCOPE_SINGLETON)
public class ManagedBean {

    @Autowired
    private TodoValidator todoValidator;

    public void use() {
        var todo = new TodoEntity();
        this.todoValidator.validate(todo);
    }

    public ManagedBean(TodoValidator todoValidator) {
        this.todoValidator = todoValidator;
    }

    @Autowired
    public void setValidador(TodoValidator todoValidator) {
        this.todoValidator = todoValidator;
    }
}
