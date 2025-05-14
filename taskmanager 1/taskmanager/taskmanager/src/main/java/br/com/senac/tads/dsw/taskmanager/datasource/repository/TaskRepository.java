package br.com.senac.tads.dsw.taskmanager.datasource.repository;

import br.com.senac.tads.dsw.taskmanager.domainmodel.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findAllByOrderByDueDateAsc();

    // CORREÇÃO AQUI
    List<Task> findByStatusOrderByDueDateAsc(Task.Status status);
}
