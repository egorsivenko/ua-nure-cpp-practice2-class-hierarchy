package ua.nure.cpp.sivenko.practice2;

import ua.nure.cpp.sivenko.practice2.entity.Aircraft;
import ua.nure.cpp.sivenko.practice2.entity.classification.*;
import ua.nure.cpp.sivenko.practice2.entity.classification.hta.*;
import ua.nure.cpp.sivenko.practice2.entity.classification.lta.*;
import ua.nure.cpp.sivenko.practice2.entity.comparators.*;

import static ua.nure.cpp.sivenko.practice2.entity.classification.LtaAircraft.LiftingGas;
import static ua.nure.cpp.sivenko.practice2.entity.classification.HtaAircraft.PropulsionType;
import static ua.nure.cpp.sivenko.practice2.entity.classification.hta.Airplane.WingType;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        LtaAircraft[] balloons = {
                new Balloon("Super Hornet VX-9", 1400, 200, LiftingGas.COAL_GAS, 43, 34),
                new Balloon("Boeing 737Max8", 7500, 500, LiftingGas.HELIUM, 65, 56),
                new Balloon("Neo Ra-73800", 1000, 350, LiftingGas.METHANE, 54, 45),
                new Balloon("Airbus A319", 3200, 140, LiftingGas.AMMONIA, 77, 60)
        };

        Aircraft[] poweredLifts = {
                new PoweredLift("Super Hornet VX-9", 1400, 75, PropulsionType.RAMJET, 217, 55),
                new PoweredLift("Boeing 737Max8", 7500, 35, PropulsionType.TURBOFAN, 542, 73),
                new PoweredLift("Neo Ra-73800", 1000, 50, PropulsionType.TURBOSHAFT, 887, 138),
                new PoweredLift("Airbus A319", 3200, 40, PropulsionType.TURBOPROP, 675, 56)
        };

        Rocket[] rockets = {
                new Rocket("Super Hornet VX-9", 1400, 75, PropulsionType.RAMJET, 400, 12250),
                new Rocket("Boeing 737Max8", 7500, 35, PropulsionType.TURBOFAN, 775, 8750),
                new Rocket("Neo Ra-73800", 1000, 50, PropulsionType.TURBOSHAFT, 650, 10600),
                new Rocket("Airbus A319", 3200, 40, PropulsionType.TURBOPROP, 650, 15000)
        };

        Airplane[] airplanes = {
                new Airplane("Super Hornet VX-9", 1400, 75, PropulsionType.RAMJET, 9, WingType.SWEPT),
                new Airplane("Boeing 737Max8", 7500, 35, PropulsionType.TURBOFAN, 4, WingType.DELTA),
                new Airplane("Neo Ra-73800", 1000, 50, PropulsionType.TURBOSHAFT, 8, WingType.SWEPT),
                new Airplane("Airbus A319", 3200, 40, PropulsionType.TURBOPROP, 6, WingType.ELLIPTICAL)
        };

        System.out.println("\n>>Balloons are sorted by Gas Capacity:");
        Arrays.stream(balloons).sorted().forEach(System.out::println);

        System.out.println("\n>>Powered Lifts are sorted by Weight:");
        Arrays.stream(poweredLifts).sorted().forEach(System.out::println);

        System.out.println("\n>>Rockets are sorted by Thrust Power:");
        Arrays.stream(rockets).sorted(new RocketThrustPowerComparator()).forEach(System.out::println);

        System.out.println("\n>>Airplanes are sorted by Wing Type:");
        Arrays.stream(airplanes).sorted(new AirplaneWingTypeComparator()).forEach(System.out::println);
    }
}
