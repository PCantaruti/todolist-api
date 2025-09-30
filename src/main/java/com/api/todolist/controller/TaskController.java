package com.api.todolist.controller;

import com.api.todolist.domain.task.Task;
import com.api.todolist.domain.task.TaskRequestDTO;
import com.api.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping
    public ResponseEntity<Task> create(@RequestBody TaskRequestDTO body) {
        Task newTask = this.taskService.createTask(body);
        return ResponseEntity.ok(newTask);
    }

}
