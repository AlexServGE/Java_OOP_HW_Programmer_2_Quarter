package Model.Classes;


import java.util.ArrayList;
import java.util.List;

public class TasksCache {
    private List<Task> cache;

    public TasksCache(){
        this.cache = new ArrayList<>();
    }

    public List<Task> getCache() {
        return cache;
    }

    public void setCache(List<Task> cache) {
        this.cache = cache;
    }
}
