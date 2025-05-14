package br.com.senac.tads.dsw.taskmanager.dto;

import br.com.senac.tads.dsw.taskmanager.domainmodel.Priority;
import br.com.senac.tads.dsw.taskmanager.domainmodel.Status;
import lombok.Builder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Builder
public class TaskDTO {
    private Long id;
    private String title;
    private String description;
    private LocalDateTime creationDate;
    private LocalDateTime completionDate;
    private LocalDate dueDate;
    private Status status;
    private Priority priority;

    public TaskDTO(Long id, String title, String description, LocalDateTime creationDate, LocalDateTime completionDate, LocalDate dueDate, Status status, Priority priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.creationDate = creationDate;
        this.completionDate = completionDate;
        this.dueDate = dueDate;
        this.status = status;
        this.priority = priority;
    }

    public TaskDTO(String title, String description, LocalDateTime creationDate, LocalDateTime completionDate, LocalDate dueDate, Status status, Priority priority) {
        this.title = title;
        this.description = description;
        this.creationDate = creationDate;
        this.completionDate = completionDate;
        this.dueDate = dueDate;
        this.status = status;
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskDTO taskDTO = (TaskDTO) o;
        return Objects.equals(id, taskDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(LocalDateTime completionDate) {
        this.completionDate = completionDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}



