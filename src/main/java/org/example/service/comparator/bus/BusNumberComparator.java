package org.example.service.comparator.bus;

import org.example.model.Bus;

import java.util.Comparator;

public class BusNumberComparator implements Comparator<Bus> {
    @Override
    public int compare(Bus o1, Bus o2) {
        return o1.getNumber().compareTo(o2.getNumber());
    }
}
