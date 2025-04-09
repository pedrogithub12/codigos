package br.com.senac.tads.dsw.taskmanager.service;


import br.com.senac.tads.dsw.taskmanager.datasource.repositories.TaskRepository;
import br.com.senac.tads.dsw.taskmanager.domainmodel.Task;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {


    // @Autowired
    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAllByOrderByDueDateAsc();

    }

    public List<Task> getTaskByStatus(Task.Status status){
        return this.taskRepository.findByStatusOrderByDueDateAsc(status);
    }

    public Task SaveTask(Task task){
        return this.taskRepository.save(task);
    }

    public void DeleteTask(Long id){
        this.taskRepository.deleteById(id);
    }

    public Task getTaskById(Long id){
        return this.taskRepository.findById(id).orElseThrow();
    }

}
