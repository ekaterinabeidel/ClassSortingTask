package org.example.service.comparator.bus;

import org.example.model.Bus;

import java.util.Comparator;

public class BusModelComparator implements Comparator<Bus> {
    @Override
    public int compare(Bus o1, Bus o2) {
        return o1.getModel().compareTo(o2.getModel());
    }
}
