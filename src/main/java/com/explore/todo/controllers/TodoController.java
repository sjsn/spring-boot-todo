package com.explore.todo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.explore.todo.dtos.TodoDto;
import com.explore.todo.mappers.TodoMapper;
import com.explore.todo.repositories.TodoRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/todos")
public class TodoController {
    private final TodoRepository todoRepository;
    private final TodoMapper todoMapper;


    @GetMapping
    public Iterable<TodoDto> getTodos() {
        var todos = todoRepository.findAll()
            .stream()
            .map(todoMapper::toDto)
            .toList();

        return todos;
    }

    @GetMapping("/{id}")
    public ResponseEntity<TodoDto> getTodoById(@PathVariable Long id) {
        var todo = todoRepository.findById(id).orElse(null);

        if (todo == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(todoMapper.toDto(todo));
    }
}
