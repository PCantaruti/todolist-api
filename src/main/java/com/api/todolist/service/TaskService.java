package com.api.todolist.service;

import com.api.todolist.domain.task.Task;
import com.api.todolist.domain.task.TaskRequestDTO;
import com.api.todolist.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Task createTask(TaskRequestDTO data) {
        Task newTask = new Task();
        newTask.setTitle(data.title());
        newTask.setDescription(data.description());
        newTask.setCompleted(false);
        newTask.setCreatedAt(java.time.LocalDateTime.now());
        return taskRepository.save(newTask);
    }
}
