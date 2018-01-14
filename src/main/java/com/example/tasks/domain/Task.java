package com.example.tasks.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dueDate;
    private Boolean completed;

    public Task() {
    }
}
