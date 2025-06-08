package com.homework6;

import com.homework6.vehicles.Bicycle;
import com.homework6.vehicles.Car;
import com.homework6.vehicles.Truck;

public class Main {
    private static final int CAR_WHEELS = 4;
    private static final int TRUCK_WHEELS_1 = 6;
    private static final int TRUCK_WHEELS_2 = 8;
    private static final int BICYCLE_WHEELS = 2;

    public static void main(String[] args) {
        ServiceStation station = new ServiceStation();

        Car car = new Car("car1", CAR_WHEELS);
        Car car2 = new Car("car2", CAR_WHEELS);
        Truck truck = new Truck("truck1", TRUCK_WHEELS_1);
        Truck truck2 = new Truck("truck2", TRUCK_WHEELS_2);
        Bicycle bicycle = new Bicycle("bicycle1", BICYCLE_WHEELS);
        Bicycle bicycle2 = new Bicycle("bicycle2", BICYCLE_WHEELS);

        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);

        station.check(car, true);
        station.check(truck, false);
    }
}