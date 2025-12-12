package io.github.juli0mendes.springarchitecture.todos;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @PostMapping
    public TodoEntity salvar(@RequestBody TodoEntity entity) {
        try {
            return this.service.save(entity);
        } catch (IllegalArgumentException e) {
            var errorMessage = "Error saving todo: " + e.getMessage();
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, errorMessage);
        }
    }

    @PutMapping("{id}")
    public void update(@PathVariable("id") Integer id, @RequestBody TodoEntity entity) {
        entity.setId(id);
        this.service.update(entity);
    }

    @GetMapping("{id}")
    public TodoEntity getById(@PathVariable("id") Integer id) {
        return this.service.findById(id);
    }
}
