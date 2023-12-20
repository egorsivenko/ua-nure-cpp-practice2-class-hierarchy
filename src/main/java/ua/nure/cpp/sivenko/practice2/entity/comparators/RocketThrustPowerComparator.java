package ua.nure.cpp.sivenko.practice2.entity.comparators;

import ua.nure.cpp.sivenko.practice2.entity.classification.hta.Rocket;

import java.util.Comparator;

public class RocketThrustPowerComparator implements Comparator<Rocket> {
    @Override
    public int compare(Rocket firstRocket, Rocket secondRocket) {
        int c = Integer.compare(secondRocket.getThrustPower(), firstRocket.getThrustPower());
        if (c == 0)
            return Integer.compare(secondRocket.getMaxAltitude(), firstRocket.getMaxAltitude());
        return c;
    }
}
