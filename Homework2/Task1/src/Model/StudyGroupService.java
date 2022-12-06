package Model;

import java.util.List;

public class StudyGroupService {

    public static StudyGroup createStudyGroup(Teacher someTeacher, List<Student> someListOfStudents) {
        return new StudyGroup(someTeacher, someListOfStudents);
    }

}
