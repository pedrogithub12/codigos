package br.com.senac.tads.dsw.taskmanager.service;

import br.com.senac.tads.dsw.taskmanager.domainmodel.Task;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface TaskServiceImpli {
    List<Task> getAllTasks();

    List<Task> getTaskByStatus(Task.Status status);

    Task saveTask(Task task);

    void deleteTask(Long id);

    Task getTaskById(Long id);

    List<Task> findAllByOrderByDueDateAsc();

    List<Task> findByStatusOrderByDueDateAsc(Task.Status status);

    boolean existsById(Long aLong);

    @Deprecated
    Task getOne(Long aLong);

    @Deprecated
    Task getById(Long aLong);

    <S extends Task> S saveAndFlush(S entity);

    void deleteAll();

    void flush();

    Page<Task> findAll(Pageable pageable);

    Task getReferenceById(Long aLong);

    <S extends Task> List<S> saveAllAndFlush(Iterable<S> entities);

    <S extends Task> List<S> findAll(Example<S> example);

    Optional<Task> findById(Long aLong);

    void deleteAllById(Iterable<? extends Long> longs);

    <S extends Task> Page<S> findAll(Example<S> example, Pageable pageable);

    @Deprecated
    void deleteInBatch(Iterable<Task> entities);

    void delete(Task entity);

    <S extends Task> List<S> findAll(Example<S> example, Sort sort);

    <S extends Task> List<S> saveAll(Iterable<S> entities);

    void deleteAll(Iterable<? extends Task> entities);

    void deleteAllInBatch(Iterable<Task> entities);

    <S extends Task> long count(Example<S> example);

    <S extends Task> S save(S entity);

    long count();

    void deleteAllByIdInBatch(Iterable<Long> longs);

    List<Task> findAllById(Iterable<Long> longs);

    <S extends Task> boolean exists(Example<S> example);

    void deleteAllInBatch();

    List<Task> findAll();

    <S extends Task> Optional<S> findOne(Example<S> example);

    List<Task> findAll(Sort sort);

    <S extends Task, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);

    void deleteById(Long aLong);
}
