package com.example.tasks.service;

import com.example.tasks.domain.Task;

public interface TaskService {

    Iterable<Task> listTask();

    Task save(Task task);
}
