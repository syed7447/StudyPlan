package in.rohit.co;

import org.springframework.stereotype.Service;

@Service
public class TaskService {
    private final TaskDao taskDao;

    public TaskService(TaskDao taskDao) {
        this.taskDao = taskDao;
    }

    public void addTask(Task task) {
        taskDao.addTask(task);
    }
}
