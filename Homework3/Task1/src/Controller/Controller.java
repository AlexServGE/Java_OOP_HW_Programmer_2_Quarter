package Controller;

import Model.*;
import View.ConsoleViewer;

import java.util.Collections;

public class Controller {

    public static StudyGroup createStudyGroup(Teacher someTeacher) {
        System.out.println(someTeacher);
        return StudyGroupService.createStudyGroup(someTeacher);
    }

    public static void sortViewStudyGroupStudents(StudyGroup someStudyGroup){
        Collections.sort(someStudyGroup.getListOfStudents(),new StudyGroupComparator());
        ConsoleViewer console = new ConsoleViewer();
        console.printStudyGroup(someStudyGroup);
    }
}
