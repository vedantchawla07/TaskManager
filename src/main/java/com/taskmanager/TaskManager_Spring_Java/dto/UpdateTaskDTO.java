package com.taskmanager.TaskManager_Spring_Java.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UpdateTaskDTO {

    String description;
    String deadline;
    Boolean completed;


}
