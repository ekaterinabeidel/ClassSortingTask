package org.example.service.strategy.student.impl;

import org.example.model.Student;
import org.example.service.comparator.student.StudentAverageGradeComparator;
import org.example.service.sort.QuickSort;
import org.example.service.strategy.student.SortStudentStrategy;

import java.util.Comparator;

public class SortStudentByAverageGrade implements SortStudentStrategy {
    @Override
    public void sort(Student[] objects) {
        QuickSort.quickSortWithComparator(objects, 0, objects.length - 1,
                new StudentAverageGradeComparator());
    }
}
