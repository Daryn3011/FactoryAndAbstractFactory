package com.company;

public class Main {

    public static void main(String[] args) {
        TransportFactory factory = new BusTransportFactory();
        Transport transport = factory.createTransport();
        transport.transportSomething();
    }
}
