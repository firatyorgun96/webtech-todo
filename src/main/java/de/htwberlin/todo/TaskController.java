package de.htwberlin.todo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class TaskController {

    @GetMapping("/tasks")
    public List<Task> getTasks() {
        return List.of(
                new Task(1L, "Einkaufen", false),
                new Task(2L, "WebTech M1 abgeben", true),
                new Task(3L, "WebTech M3 abgeben", false)
        );
    }
}