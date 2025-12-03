package com.example.Task.Tracker.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data //getter+setter+hashcode+tostring+equals
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(updatable = false,nullable = false)
    private UUID id;

    @Column(nullable = false)
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "due_date",nullable = false)
    private LocalDateTime dueDate;

    @Column(nullable = false)
    private TasKStatus status;

    @Column(nullable = false)
    private TaskPriority priority;

    @Column(name = "created_date",nullable = false)
    private LocalDateTime createdDate;

    @Column(name = "updated_date",nullable = false)
    private LocalDateTime updatedDate;

}
