package Model;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> listOfStudents;
    private static long idCreator = 0;
    private final long groupId;

    public StudyGroup(Teacher teacher){
        this.teacher = teacher;
        this.listOfStudents = new ArrayList<>();
        this.groupId = idCreator++;
    }

    public long getGroupId() {
        return groupId;
    }



    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(List<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "teacher=" + teacher +
                ", listOfStudents=" + listOfStudents +
                '}';
    }
}
