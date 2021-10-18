package com.company;

public class RuVehicleFactory implements VehicleFactory {
    @Override
    public Exhaust getExhaust() {
        return new RuExhaust();
    }

    @Override
    public Wheel getWheel() {
        return new RuWheel();
    }

    @Override
    public Door getDoor() {
        return new RuDoor();
    }
}
