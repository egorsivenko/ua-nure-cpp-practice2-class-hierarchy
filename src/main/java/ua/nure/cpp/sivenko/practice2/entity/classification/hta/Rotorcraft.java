package ua.nure.cpp.sivenko.practice2.entity.classification.hta;

import ua.nure.cpp.sivenko.practice2.entity.classification.HtaAircraft;

import java.util.Objects;

public class Rotorcraft extends HtaAircraft {
    private int rotorDiameter;
    private int maxAltitude;

    public Rotorcraft() {}

    public Rotorcraft(String model, int weight, int wingspan, PropulsionType propulsionType, int rotorDiameter, int maxAltitude) {
        super(model, weight, wingspan, propulsionType);
        setRotorDiameter(rotorDiameter);
        setMaxAltitude(maxAltitude);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Rotorcraft rotorcraft))
            return false;

        if (!super.equals(obj))
            return false;

        return rotorDiameter == rotorcraft.rotorDiameter && maxAltitude == rotorcraft.maxAltitude;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rotorDiameter, maxAltitude);
    }

    @Override
    public String toString() {
        return "-Aircraft Type: " + this.getClass().getSimpleName() +
                super.toString() +
                "\nRotor Diameter: " + rotorDiameter +
                "\nMax Altitude: " + maxAltitude + "\n";
    }

    public int getRotorDiameter() {
        return rotorDiameter;
    }

    public int getMaxAltitude() {
        return maxAltitude;
    }

    public void setRotorDiameter(int rotorDiameter) {
        if (rotorDiameter <= 0)
            throw new IllegalArgumentException("Rotor diameter cannot be 0 or negative");
        this.rotorDiameter = rotorDiameter;
    }

    public void setMaxAltitude(int maxAltitude) {
        if (maxAltitude <= 0)
            throw new IllegalArgumentException("Max altitude cannot be 0 or negative");
        this.maxAltitude = maxAltitude;
    }
}
