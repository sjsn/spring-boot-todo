package com.explore.todo.mappers;

import org.mapstruct.Mapper;

import com.explore.todo.dtos.TodoDto;
import com.explore.todo.models.Todo;

@Mapper(componentModel = "spring")
public interface TodoMapper {
    TodoDto toDto(Todo todo);
}
