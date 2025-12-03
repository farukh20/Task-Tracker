package com.example.Task.Tracker.dto;

import com.example.Task.Tracker.entity.TasKStatus;
import com.example.Task.Tracker.entity.TaskPriority;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskDto {
    UUID id;
    String title;
    String description;
    LocalDateTime dueDate;
    TasKStatus status;
    TaskPriority priority;

}
