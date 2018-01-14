package com.example.tasks;

import com.example.tasks.domain.Task;
import com.example.tasks.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class TasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(TaskService taskService){
		return args -> {
			taskService.save( new Task(1L,"Create Spring boot Application", LocalDate.now(), true));
			taskService.save( new Task(2L,"Walking The Dog", LocalDate.now().plus(1, ChronoUnit.DAYS), false));
			taskService.save( new Task(3L,"Feeding the cat", LocalDate.now().plus(2, ChronoUnit.DAYS), false));
		};
	}
}
