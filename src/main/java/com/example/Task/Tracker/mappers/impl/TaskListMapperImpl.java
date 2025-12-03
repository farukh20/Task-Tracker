package com.example.Task.Tracker.mappers.impl;

import com.example.Task.Tracker.dto.TaskDto;
import com.example.Task.Tracker.dto.TaskListDto;
import com.example.Task.Tracker.entity.TasKStatus;
import com.example.Task.Tracker.entity.TaskList;
import com.example.Task.Tracker.mappers.TaskListMapper;
import com.example.Task.Tracker.mappers.TaskMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TaskListMapperImpl implements TaskListMapper {


    private TaskMapper taskMapper;



    @Override
    public TaskList fromDto(TaskListDto taskListDto) {
        return new TaskList(
                taskListDto.getId(),
                taskListDto.getTitle(),
                taskListDto.getDescription(),
                Optional.ofNullable(taskListDto.getTasks())
                        .map(tasks -> tasks.stream()
                                .map(taskMapper::fromDto)
                                .toList()
                        ).orElse(null),
                null,
                null
        );
    }

    @Override
    public TaskListDto toDto(TaskList taskList) {
        TaskListDto dto = new TaskListDto();
        dto.setId(taskList.getId());
        dto.setTitle(taskList.getTitle());
        dto.setDescription(taskList.getDescription());

        // Convert tasks to TaskDto using taskMapper
        List<TaskDto> taskDtos = Optional.ofNullable(taskList.getTasks())
                .map(tasks -> tasks.stream()
                        .map(taskMapper::toDto)
                        .toList()
                ).orElse(List.of()); // empty list if null
        dto.setTasks(taskDtos);

        // Calculate count and progress
        int totalTasks = taskDtos.size();
        dto.setCount(totalTasks);

        double progress = totalTasks == 0 ? 0 :
                taskDtos.stream().filter(t -> t.getStatus() == TasKStatus.CLOSED).count() * 100.0 / totalTasks;
        dto.setProgress(progress);

        return dto;
    }
}
