package Model;

import java.util.List;

public class StudyGroupService {

    public static StudyGroup createStudyGroup(Teacher someTeacher) {
        return new StudyGroup(someTeacher);
    }

    public static void add(StudyGroup someStudyGroup, Student someStudent){
        someStudyGroup.getListOfStudents().add(someStudent);
    }

    public static void add(StudyGroup someStudyGroup, List<Student> someArrayOfStudents){
        someStudyGroup.getListOfStudents().addAll(someArrayOfStudents);
    }

}
