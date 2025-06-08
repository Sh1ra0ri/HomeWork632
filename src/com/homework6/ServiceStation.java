package com.homework6;

import com.homework6.vehicles.Car;
import com.homework6.vehicles.Truck;
import com.homework6.vehicles.Vehicle;

public class ServiceStation {
    public void check(Vehicle vehicle) {
        if (vehicle != null) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
            }
            if (vehicle instanceof Car) {
                ((Car) vehicle).checkEngine();
            } else if (vehicle instanceof Truck) {
                ((Truck) vehicle).checkEngine();
                ((Truck) vehicle).checkTrailer();
            }
        }
    }

    public void check(Vehicle vehicle, boolean fullCheck) {
        if (vehicle != null) {
            System.out.println("Обслуживаем " + vehicle.getModelName() + (fullCheck ? " с полной проверкой" : ""));
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
            }
            if (fullCheck) {
                if (vehicle instanceof Car) {
                    ((Car) vehicle).checkEngine();
                } else if (vehicle instanceof Truck) {
                    ((Truck) vehicle).checkEngine();
                    ((Truck) vehicle).checkTrailer();
                }
            }
        }
    }
}