package com.company;

public class EnWheel implements Wheel {
    @Override
    public void spin() {
        System.out.println("Wheel spins");
    }

    @Override
    public void turn() {
        System.out.println("Wheel turns");
    }
}
