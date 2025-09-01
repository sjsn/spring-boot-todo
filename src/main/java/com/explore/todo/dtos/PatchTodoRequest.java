package com.explore.todo.dtos;

import lombok.Data;

@Data
public class PatchTodoRequest {
    private String name;
    private boolean complete;
}
