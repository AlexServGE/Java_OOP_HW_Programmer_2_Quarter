package Model.Services;

import Model.Classes.Task;
import Model.Classes.TasksCache;
import Model.Classes.TasksDB;

import java.util.ArrayList;

public class TasksCacheService {

    public static TasksCache createTasksCache(){
        return new TasksCache();
    }
    public static void add(TasksCache someTaskCache, Task someTask) {
        someTaskCache.getCache().add(someTask);
    }

    public static void exportToDB(TasksCache someTaskCache, TasksDB someTaskDB) {
        someTaskDB.getDB().addAll(someTaskCache.getCache());
        someTaskCache.setCache(new ArrayList<>());
    }

    public static void importDB(TasksDB someTaskDB,TasksCache someTaskCache) {
        someTaskCache.getCache().addAll(someTaskDB.getDB());
        someTaskDB.setDB(new ArrayList<>());
    }
}
