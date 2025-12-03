package com.example.Task.Tracker.dto;

import com.example.Task.Tracker.entity.Task;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskListDto {
    UUID id;
    String title;
    String description;
    Integer count;
    Double progress;
    List<TaskDto> tasks;
}
