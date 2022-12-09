package Viewer;

import Model.Classes.Task;
import Model.Classes.TasksCache;
import Model.Classes.TasksDB;

public class Viewer {

    public void showMenu() {
        StringBuilder menu = new StringBuilder();
        menu.append(
                "CREATE - создать задачу\n" +
                        "EXPORT - экспортировать созданные задачи в базу данных\n" +
                        "IMPORT - импортировать все задачи из базы данных\n" +
                        "MENU - вернуться в меню\n" +
                        "CACHE - показать созданные задачи, готовых к экспорту в базу данных\n" +
                        "DB - показать базу данных задач\n" +
                        "-------------------------------------------------------------------------"
        );
        System.out.println(menu);
    }

    public void showPriorityMenu() {
        StringBuilder priorityMenu = new StringBuilder();
        priorityMenu.append(
                "HIGH - высший приотет\n" +
                        "MEDIUM - средний приоритет\n" +
                        "LOW - низкий приоритет\n" +
                        "-------------------------------------------------------------------------"
        );
        System.out.println(priorityMenu);
    }

    public void showCache(TasksCache someTasksCache){
        for (Task task : someTasksCache.getCache()){
            System.out.println(task);
        }
        System.out.println();
    }

    public void showDB(TasksDB someTasksDB){
        for (Task task : someTasksDB.getDB()){
            System.out.println(task);
        }
        System.out.println();
    }
}

