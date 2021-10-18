package com.company;

public interface VehicleFactory {
    Exhaust getExhaust();
    Wheel getWheel();
    Door getDoor();
}
