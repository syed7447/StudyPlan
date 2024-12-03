package in.rohit.co;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    // Endpoint to add a task
    @PostMapping("/add")
    public Task addTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }
}
