package br.com.senac.tads.dsw.taskmanager.service;

import br.com.senac.tads.dsw.taskmanager.datasource.repository.TaskRepository;
import br.com.senac.tads.dsw.taskmanager.domainmodel.Task;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class TaskServiceImpl implements TaskServiceImpli {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> getAllTasks(){
        return taskRepository.findAllByOrderByDueDateAsc();
    }

    @Override
    public List<Task> getTaskByStatus(Task.Status status){
        return this.taskRepository.findByStatusOrderByDueDateAsc(status);

    }

    @Override
    public Task saveTask(Task task){
        return this.taskRepository.save(task);
    }
    @Override
    public void deleteTask(Long id){
        this.taskRepository.deleteById(id);
    }

    @Override
    public Task getTaskById(Long id){
        return this.taskRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Task> findAllByOrderByDueDateAsc() {
        return taskRepository.findAllByOrderByDueDateAsc();
    }

    @Override
    public List<Task> findByStatusOrderByDueDateAsc(Task.Status status) {
        return taskRepository.findByStatusOrderByDueDateAsc(status);
    }

    @Override
    public boolean existsById(Long aLong) {
        return taskRepository.existsById(aLong);
    }

    @Deprecated
    @Override
    public Task getOne(Long aLong) {
        return taskRepository.getOne(aLong);
    }

    @Deprecated
    @Override
    public Task getById(Long aLong) {
        return taskRepository.getById(aLong);
    }

    @Override
    public <S extends Task> S saveAndFlush(S entity) {
        return taskRepository.saveAndFlush(entity);
    }

    @Override
    public void deleteAll() {
        taskRepository.deleteAll();
    }

    @Override
    public void flush() {
        taskRepository.flush();
    }

    @Override
    public Page<Task> findAll(Pageable pageable) {
        return taskRepository.findAll(pageable);
    }

    @Override
    public Task getReferenceById(Long aLong) {
        return taskRepository.getReferenceById(aLong);
    }

    @Override
    public <S extends Task> List<S> saveAllAndFlush(Iterable<S> entities) {
        return taskRepository.saveAllAndFlush(entities);
    }

    @Override
    public <S extends Task> List<S> findAll(Example<S> example) {
        return taskRepository.findAll(example);
    }

    @Override
    public Optional<Task> findById(Long aLong) {
        return taskRepository.findById(aLong);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
        taskRepository.deleteAllById(longs);
    }

    @Override
    public <S extends Task> Page<S> findAll(Example<S> example, Pageable pageable) {
        return taskRepository.findAll(example, pageable);
    }

    @Deprecated
    @Override
    public void deleteInBatch(Iterable<Task> entities) {
        taskRepository.deleteInBatch(entities);
    }

    @Override
    public void delete(Task entity) {
        taskRepository.delete(entity);
    }

    @Override
    public <S extends Task> List<S> findAll(Example<S> example, Sort sort) {
        return taskRepository.findAll(example, sort);
    }

    @Override
    public <S extends Task> List<S> saveAll(Iterable<S> entities) {
        return taskRepository.saveAll(entities);
    }

    @Override
    public void deleteAll(Iterable<? extends Task> entities) {
        taskRepository.deleteAll(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<Task> entities) {
        taskRepository.deleteAllInBatch(entities);
    }

    @Override
    public <S extends Task> long count(Example<S> example) {
        return taskRepository.count(example);
    }

    @Override
    public <S extends Task> S save(S entity) {
        return taskRepository.save(entity);
    }

    @Override
    public long count() {
        return taskRepository.count();
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {
        taskRepository.deleteAllByIdInBatch(longs);
    }

    @Override
    public List<Task> findAllById(Iterable<Long> longs) {
        return taskRepository.findAllById(longs);
    }

    @Override
    public <S extends Task> boolean exists(Example<S> example) {
        return taskRepository.exists(example);
    }

    @Override
    public void deleteAllInBatch() {
        taskRepository.deleteAllInBatch();
    }

    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public <S extends Task> Optional<S> findOne(Example<S> example) {
        return taskRepository.findOne(example);
    }

    @Override
    public List<Task> findAll(Sort sort) {
        return taskRepository.findAll(sort);
    }

    @Override
    public <S extends Task, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return taskRepository.findBy(example, queryFunction);
    }

    @Override
    public void deleteById(Long aLong) {
        taskRepository.deleteById(aLong);
    }
}
