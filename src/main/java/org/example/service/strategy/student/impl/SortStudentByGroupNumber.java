package org.example.service.strategy.student.impl;

import org.example.model.Student;
import org.example.service.sort.QuickSort;
import org.example.service.strategy.student.SortStudentStrategy;

import java.util.Comparator;

public class SortStudentByGroupNumber implements SortStudentStrategy {
    @Override
    public void sort(Student[] objects) {
        Comparator<Student> studentGroupComparator = (o1, o2) -> o1.getGroupNumber().compareTo(o2.getGroupNumber());
        QuickSort.quickSortWithComparator(objects, 0, objects.length - 1, studentGroupComparator);
    }
}
