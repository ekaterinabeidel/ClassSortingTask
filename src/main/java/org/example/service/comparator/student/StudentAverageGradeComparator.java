package org.example.service.comparator.student;

import org.example.model.Student;

import java.util.Comparator;

public class StudentAverageGradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAverageGrade().compareTo(o2.getAverageGrade());
    }
}
