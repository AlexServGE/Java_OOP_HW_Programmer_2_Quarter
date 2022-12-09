package Controller;

import Model.Classes.Task;
import Model.Classes.TasksCache;
import Model.Classes.TasksDB;
import Model.Commands;
import Model.PriorityCommands;
import Model.Services.TaskService;
import Model.Services.TasksCacheService;
import Viewer.Viewer;

import java.util.Scanner;

import static Model.Commands.*;
import static Model.PriorityCommands.*;

public class Controller {

    public void run() {
        Viewer viewer = new Viewer();
        String userStringCmd;
        Commands userCmd;
        TasksCache tasksCacheRun = TasksCacheService.createTasksCache();
        TasksDB tasksDBRun = new TasksDB();
        while (true) {
            viewer.showMenu();
            userStringCmd = this.prompt("Введите команду: ");
            userCmd = Commands.valueOf(userStringCmd.toUpperCase());
            switch (userCmd) {
                case CREATE:
                    String taskPriority = definePriority();
                    String taskDeadline = prompt("Введите срок задачи: ");
                    String authorSurName = prompt("Введите Вашу фамилию: ");
                    String authorName = prompt("Введите Ваше имя: ");
                    Task newTask = TaskService.createTask(taskPriority, taskDeadline, authorSurName, authorName);
                    TasksCacheService.add(tasksCacheRun,newTask);
                    break;
                case EXPORT:
                    TasksCacheService.exportToDB(tasksCacheRun,tasksDBRun);
                    break;
                case IMPORT:
                    TasksCacheService.importDB(tasksDBRun,tasksCacheRun);
                    break;
                case CACHE:
                    viewer.showCache(tasksCacheRun);
                    break;
                case DB:
                    viewer.showDB(tasksDBRun);
                    break;

            }
        }

    }

    public String definePriority() {
        Viewer viewer = new Viewer();
        viewer.showPriorityMenu();
        String userStringCmd = this.prompt("Введите приоритет: ");
        PriorityCommands userCmd = PriorityCommands.valueOf(userStringCmd.toUpperCase());
        switch (userCmd) {
            case HIGH:
                return "Высокий";
            case MEDIUM:
                return "Средний";
            case LOW:
                return "Низкий";
        }
        return "Отсутствует";
    }

    public String prompt(String text) {
        Scanner userInput = new Scanner(System.in);
        System.out.print(text);
        String userReply = userInput.nextLine();
        System.out.println();
        return userReply;
    }
}
