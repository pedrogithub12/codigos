package br.com.senac.tads.dsw.taskmanager.controllers;


import br.com.senac.tads.dsw.taskmanager.domainmodel.Task;
import br.com.senac.tads.dsw.taskmanager.service.TaskServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/task")
public class TaskController {
    private TaskServiceImpl taskServiceImpl;

    public TaskController(TaskServiceImpl taskServiceImpl){
        this.taskServiceImpl = taskServiceImpl;
    }

    @GetMapping
    public String viewTasks(Model model){
        model.addAttribute("tasks", this.taskServiceImpl.getAllTasks());
        model.addAttribute("newtask", new Task());
        return "task/all_tasks";
    }

    @PostMapping
    public String addTask(@ModelAttribute Task newTask){
        this.taskServiceImpl.saveTask(newTask);
        return "redirect:task/all_tasks";
    }

    @PostMapping("/{id}/complete")
    public String completeTask(@PathVariable Long id){
        Task task = this.taskServiceImpl.getTaskById(id);
        task.setStatus(Task.Status.DONE);
        this.taskServiceImpl.saveTask(task);
        return "redirect:task/all_tasks";
    }

    @PostMapping("/{id}/delete")
    public String deleteTask(@PathVariable Long id){
        Task task = this.taskServiceImpl.getTaskById(id);
        this.taskServiceImpl.deleteTask(id);
        return "redirect:task/all_tasks";
    }

    @PostMapping("/{id}/start")
    public String startTask(@PathVariable Long id){
        Task task = this.taskServiceImpl.getTaskById(id);
        task.setStatus(Task.Status.IN_PROGRESS);
        this.taskServiceImpl.saveTask(task);
        return "redirect:task/all_tasks";
    }

}
