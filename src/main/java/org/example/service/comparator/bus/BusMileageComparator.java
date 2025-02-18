package org.example.service.comparator.bus;

import org.example.model.Bus;

import java.util.Comparator;

public class BusMileageComparator implements Comparator<Bus> {
    @Override
    public int compare(Bus o1, Bus o2) {
        return Double.compare(o1.getMileage(), o2.getMileage());
    }
}
