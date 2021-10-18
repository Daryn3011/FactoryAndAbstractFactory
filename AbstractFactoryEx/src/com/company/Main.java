package com.company;

public class Main {

    public static void main(String[] args) {
        VehicleFactory factory = getFactoryByCountry("EN");
        Exhaust e = factory.getExhaust();
        Wheel w = factory.getWheel();
        Door d = factory.getDoor();
        e.emitsFire();
        w.spin();
        d.opens();
    }


    private static VehicleFactory getFactoryByCountry(String lang){
        switch (lang){
            case "RU":
                return new RuVehicleFactory();
            case "EN":
                return new EnVehicleFactory();
            default:
                throw  new RuntimeException("Unknown country: " + lang);
        }
    }
}
