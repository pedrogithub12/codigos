package br.com.senac.tads.dsw.taskmanager.controller;


import br.com.senac.tads.dsw.taskmanager.domainmodel.Task;
import br.com.senac.tads.dsw.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/task")
public class TaskController {


    @Autowired
    private TaskService taskService;

    @GetMapping
    public String viewTasks(Model model) {
        model.addAttribute("tasks", this.taskService.getAllTasks());
        model.addAttribute("newTask", new Task());
        return "task/all_tasks";


    }

        @PostMapping
        public String addTask(@ModelAttribute Task newTask) {
            this.taskService.SaveTask(newTask);
            return "redirect:/task/all_tasks";


        }

        @PostMapping("/{id}/complete")
        public String completeTask(@PathVariable Long id) {
        Task task = this.taskService.getTaskById(id);
        task.setStatus(Task.Status.DONE);
        this.taskService.SaveTask(task);
        return "redirect:/task/all_tasks";


        }

        @PostMapping("/{id/delete}")
        public String deleteTask(@PathVariable Long id) {
        Task task = this.taskService.getTaskById(id);
        this.taskService.DeleteTask(id);
        return "redirect:/task/all_tasks";
        }



}
