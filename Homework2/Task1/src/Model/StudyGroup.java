package Model;

import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> listOfStudents;

    public StudyGroup(Teacher teacher, List<Student> listOfStudents){
        this.teacher = teacher;
        this.listOfStudents = listOfStudents;
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
