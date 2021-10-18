package com.company;

public class EnVehicleFactory implements VehicleFactory {
    @Override
    public Exhaust getExhaust() {
        return new EnExhaust();
    }

    @Override
    public Wheel getWheel() {
        return new EnWheel();
    }

    @Override
    public Door getDoor() {
        return new EnDoor();
    }
}
