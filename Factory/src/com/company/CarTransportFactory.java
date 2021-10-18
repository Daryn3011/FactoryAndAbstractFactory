package com.company;

public class CarTransportFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new CarTransport();
    }
}
