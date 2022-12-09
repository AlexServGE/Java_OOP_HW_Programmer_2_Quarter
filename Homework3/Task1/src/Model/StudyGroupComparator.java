package Model;

import java.util.Comparator;

public class StudyGroupComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getSurname().equalsIgnoreCase(student2.getSurname())){
            return student1.getName().compareToIgnoreCase(student2.getName());
        }
        return student1.getSurname().compareToIgnoreCase(student2.getSurname());
    }
}
