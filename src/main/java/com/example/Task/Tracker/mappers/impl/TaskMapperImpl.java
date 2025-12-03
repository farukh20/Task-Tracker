package com.example.Task.Tracker.mappers.impl;

import com.example.Task.Tracker.dto.TaskDto;
import com.example.Task.Tracker.entity.Task;
import com.example.Task.Tracker.mappers.TaskMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public Task fromDto(TaskDto taskDto) {
        return new Task(
                taskDto.getId(),
                taskDto.getTitle(),
                taskDto.getDescription(),
                taskDto.getDueDate(),
                taskDto.getStatus(),
                taskDto.getPriority(),
                null,
                null,
                null
        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                task.getStatus(),
                task.getPriority()

        );
    }
}
