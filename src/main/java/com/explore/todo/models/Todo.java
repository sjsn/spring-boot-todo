package com.explore.todo.models;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "todo")
public class Todo {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private boolean isComplete;

    @Getter
    @Setter
    private Instant createdAt;

    @Getter
    @Setter
    private Instant updatedAt;

    protected Todo() {}

    public Todo(String name) {
        this.name = name;
        this.isComplete = false;
        this.createdAt = Instant.now();
        this.updatedAt = Instant.now();
    }

    @Override
    public String toString() {
        return String.format(
            "Todo: {id:%d, name:'%s', isComplete:'%s', createdAt:'%s', updatedAt:'%s'}",
            this.id, this.name, this.isComplete, this.createdAt, this.updatedAt
        );
    }
}
