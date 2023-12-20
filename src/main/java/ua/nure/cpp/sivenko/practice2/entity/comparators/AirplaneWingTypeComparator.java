package ua.nure.cpp.sivenko.practice2.entity.comparators;

import ua.nure.cpp.sivenko.practice2.entity.classification.hta.Airplane;

import java.util.Comparator;

public class AirplaneWingTypeComparator implements Comparator<Airplane> {
    @Override
    public int compare(Airplane firstAirplane, Airplane secondAirplane) {
        int c = firstAirplane.getWingType().getLabel().compareTo(secondAirplane.getWingType().getLabel());
        if (c == 0)
            return Integer.compare(firstAirplane.getNumberOfEngines(), secondAirplane.getNumberOfEngines());
        return c;
    }
}
