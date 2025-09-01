# Spring Boot To Do

## Motivation
Experiment with Java Spring Boot with a simple To Do API with actual data persistence into a Postgres database.

## Getting Started
1. Run `docker-compose up` to run the Postgres database
1. Run application with `./mvnw spring-boot:run`

### Accessing the database
Run `docker exec -it todo-db-1 psql -d springboot-todo` to get access to the database via the `psql` cli

#### Helpful `psql` commands
1. `\dt` to list the tables
1. `\d <tablename>` to table details