package com.example.Task.Tracker.mappers;

import com.example.Task.Tracker.dto.TaskListDto;
import com.example.Task.Tracker.entity.TaskList;

public interface TaskListMapper {
    TaskList fromDto(TaskListDto taskListDto);
    TaskListDto toDto(TaskList taskList);
}
