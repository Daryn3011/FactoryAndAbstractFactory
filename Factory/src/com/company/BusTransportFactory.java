package com.company;

public class BusTransportFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new BusTransport();
    }
}
