package com.company;

public class RuWheel implements Wheel {
    @Override
    public void spin() {
        System.out.println("Колеса крутятся");
    }

    @Override
    public void turn() {
        System.out.println("Колеса поворачиваются");
    }
}
