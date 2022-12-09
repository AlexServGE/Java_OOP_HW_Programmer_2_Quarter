package Model.Services;

import Model.Classes.Task;
import Model.Classes.TasksCache;

public class TaskService {

    public static Task createTask(String priority, String deadline, String authorSurname, String authorName){
        return new Task(priority, deadline, authorSurname, authorName);
    }
}
