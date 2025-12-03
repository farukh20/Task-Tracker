package com.example.Task.Tracker.mappers;

import com.example.Task.Tracker.dto.TaskDto;
import com.example.Task.Tracker.entity.Task;

import java.util.function.Function;

public interface TaskMapper{
    Task fromDto(TaskDto taskDto);
    TaskDto toDto(Task task);
}
