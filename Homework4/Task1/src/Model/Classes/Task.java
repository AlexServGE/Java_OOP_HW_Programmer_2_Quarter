package Model.Classes;

import java.util.Calendar;

public class Task {
    private static long creatorId = 0;
    private long id;
    private String priority;
    private String inputDate;
    private String inputTime;
    private String deadline;
    private String authorSurname;
    private String authorName;



    public Task(String priority, String deadline, String authorSurname, String authorName){
        this.id = creatorId++;
        this.priority = priority;
        this.inputDate = String.format("%tD", Calendar.getInstance());
        this.inputTime = String.format("%tT", Calendar.getInstance());
        this.deadline = deadline;
        this.authorSurname = authorSurname;
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", priority='" + priority + '\'' +
                ", inputDate='" + inputDate + '\'' +
                ", inputTime='" + inputTime + '\'' +
                ", deadline='" + deadline + '\'' +
                ", authorSurname='" + authorSurname + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
