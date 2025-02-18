package org.example.service.sorter;

import org.example.service.strategy.SortStrategy;

public abstract class Sorter<T> {
    private SortStrategy<T> strategy;

    public void setStrategy(SortStrategy<T> strategy) {
        this.strategy = strategy;
    }

    public void sort(T[] objects){
        strategy.sort(objects);
    }
}
