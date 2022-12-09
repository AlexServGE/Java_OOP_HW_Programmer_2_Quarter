package Model.Classes;

import java.util.ArrayList;
import java.util.List;

public class TasksDB {
    private List<Task> db;

    public TasksDB() {
        this.db = new ArrayList<>();
    }

    public List<Task> getDB() {
        return db;
    }

    public void setDB(List<Task> db) {
        this.db = db;
    }
}
