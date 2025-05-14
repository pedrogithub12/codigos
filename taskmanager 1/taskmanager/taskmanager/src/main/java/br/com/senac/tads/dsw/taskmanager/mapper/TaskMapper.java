package br.com.senac.tads.dsw.taskmanager.mapper;

import br.com.senac.tads.dsw.taskmanager.domainmodel.Task;
import br.com.senac.tads.dsw.taskmanager.dto.TaskDTO;

public class TaskMapper {
    public TaskDTO toDTO(Task task){
        if( task == null )
            throw new IllegalArgumentException(" Task entity must not be null!");

        return new TaskDTO(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getCreatedAt(),
                task.getUpdatedAt(),
                task.getDueDate(),
                task.getStatus(),
                task.getPriority()
        );
    }

    public Task toEntity( TaskDTO dto){
        if( dto == null )
            throw new IllegalArgumentException(" TaskDTO must not be null!");
        return new Task(
                dto.getId(),
                dto.getTitle(),
                dto.getDescription(),
                dto.getDueDate(),
                dto.getCreationDate(),
                dto.getCompletionDate(),
                dto.getPriority(),
                dto.getStatus()
        );
    }
}
