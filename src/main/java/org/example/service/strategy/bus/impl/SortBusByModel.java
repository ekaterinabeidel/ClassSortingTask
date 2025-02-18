package org.example.service.strategy.bus.impl;

import org.example.model.Bus;
import org.example.service.comparator.bus.BusModelComparator;
import org.example.service.sort.QuickSort;
import org.example.service.strategy.bus.SortBusStrategy;

import java.util.Comparator;

public class SortBusByModel implements SortBusStrategy {
    @Override
    public void sort(Bus[] buses) {
        QuickSort.quickSortWithComparator(buses, 0, buses.length - 1,
                new BusModelComparator());
    }
}
