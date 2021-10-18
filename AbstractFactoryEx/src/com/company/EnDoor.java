package com.company;

public class EnDoor implements Door {

    @Override
    public void opens() {
        System.out.println("Door opens");
    }

    @Override
    public void closes() {
        System.out.println("Door closes");
    }
}
