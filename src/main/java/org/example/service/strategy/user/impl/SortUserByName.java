package org.example.service.strategy.user.impl;

import org.example.model.User;
import org.example.service.comparator.user.UserNameComparator;
import org.example.service.sort.QuickSort;
import org.example.service.strategy.user.SortUserStrategy;

public class SortUserByName implements SortUserStrategy {
    @Override
    public void sort(User[] objects) {
        QuickSort.quickSortWithComparator(objects, 0, objects.length - 1,
                new UserNameComparator());
    }
}
