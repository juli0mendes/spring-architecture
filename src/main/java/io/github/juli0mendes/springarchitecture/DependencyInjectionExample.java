package io.github.juli0mendes.springarchitecture;

import io.github.juli0mendes.springarchitecture.todos.MailSender;
import io.github.juli0mendes.springarchitecture.todos.TodoRepository;
import io.github.juli0mendes.springarchitecture.todos.TodoService;
import io.github.juli0mendes.springarchitecture.todos.TodoValidator;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DependencyInjectionExample {

    public static void main(String[] args) throws SQLException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("");
        dataSource.setUsername("");
        dataSource.setPassword("");

        Connection connection = dataSource.getConnection();

        EntityManager entityManager = null;

        TodoRepository repository = null; //new SimpleJpaRepository<TodoRepository, Integer>(nulL, null);
        TodoValidator todoValidator = new TodoValidator(repository);
        MailSender mailSender = new MailSender();

        TodoService service = new TodoService(repository, todoValidator, mailSender);
    }
}
