package com.explore.todo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.explore.todo.models.Todo;

public interface TodoRepository extends CrudRepository<Todo, Long> { }
