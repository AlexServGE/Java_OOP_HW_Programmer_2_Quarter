import Model.Student;
import Model.StudyGroup;
import Model.StudyGroupService;
import Model.Teacher;
import View.ConsoleViewer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Петров", "Петя");
        Student s2 = new Student("Петров", "Анатолий");
        Student s3 = new Student("Александров", "Гоша");
        Student s4 = new Student("Иванов", "Ваня");
        Teacher t1 = new Teacher("Александрова", "Мария");
        StudyGroup sg1 = Controller.Controller.createStudyGroup(t1);
        StudyGroupService.add(sg1,Arrays.asList(s1,s2,s3,s4));
        Controller.Controller.sortViewStudyGroupStudents(sg1);
    }
}