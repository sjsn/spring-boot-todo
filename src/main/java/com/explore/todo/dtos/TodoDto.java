package com.explore.todo.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TodoDto {
    private final long id;
    private final String name;
    private final boolean isCompleted;
}
