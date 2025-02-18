package org.example.service.strategy;

import java.util.Comparator;

public interface SortStrategy<T> {
    void sort(T[] objects);

}
