package com.explore.todo.mappers;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.explore.todo.dtos.AddTodoRequest;
import com.explore.todo.dtos.PatchTodoRequest;
import com.explore.todo.dtos.TodoDto;
import com.explore.todo.models.Todo;

@Mapper(componentModel = "spring")
public interface TodoMapper {
    TodoDto toDto(Todo todo);
    Todo toEntity(AddTodoRequest addTodoRequest);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void update(PatchTodoRequest patchTodoRequest, @MappingTarget Todo todo);
}
