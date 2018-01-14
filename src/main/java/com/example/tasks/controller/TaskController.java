package com.example.tasks.controller;

import com.example.tasks.domain.Task;
import com.example.tasks.service.TaskService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping({"/",""})
    public Iterable<Task> listTasks(){
        return taskService.listTask();
    }

    @PostMapping("/create")
    public Task saveTask(@RequestBody Task task){
        return taskService.save(task);
    }

}
