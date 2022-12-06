package Controller;

import Model.Student;
import Model.StudyGroup;
import Model.StudyGroupService;
import Model.Teacher;

import java.util.List;

public class Controller {

    public static StudyGroup createStudyGroup(Teacher someTeacher, List<Student> someListOfStudents) {
        System.out.println(someTeacher);
        System.out.println(someListOfStudents);
        return StudyGroupService.createStudyGroup(someTeacher, someListOfStudents);
    }
}
