package View;

import Model.Student;
import Model.StudyGroup;

public class ConsoleViewer implements Viewer {


    @Override
    public  void printStudyGroup(StudyGroup someStudyGroup) {
        StringBuilder resultToView = new StringBuilder();
        for (Student someStudent : someStudyGroup.getListOfStudents()) {
            resultToView.append(someStudent.getSurname() + " " +
                    someStudent.getName() + " - " +
                    "Группа" + " " +
                    someStudyGroup.getGroupId() + "\n"
            );
        }
        System.out.println(resultToView);
    }
}

