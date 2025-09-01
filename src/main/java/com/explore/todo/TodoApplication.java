package com.explore.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.explore.todo.models.Todo;
import com.explore.todo.repositories.TodoRepository;

@SpringBootApplication
public class TodoApplication {

	@Autowired
	private TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner() {
		return args -> {
			// Seed database with two starter todos
			if (todoRepository.count() == 0) {
				var todo1 = new Todo("Get familiar with Java Spring Boot");
				var todo2 = new Todo("Build a test todo app");

				todoRepository.save(todo1);
				todoRepository.save(todo2);
			}
		};
	}
}
