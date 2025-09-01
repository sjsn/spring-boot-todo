package com.explore.todo.dtos;

import lombok.Data;

@Data
public class AddTodoRequest {
    private String name;
    private boolean isCompleted;
}
