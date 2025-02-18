package org.example.service.comparator.student;

import org.example.model.Student;

import java.util.Comparator;

public class StudentRecordBookNumberComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getRecordBookNumber().compareTo(o2.getRecordBookNumber());
    }
}
