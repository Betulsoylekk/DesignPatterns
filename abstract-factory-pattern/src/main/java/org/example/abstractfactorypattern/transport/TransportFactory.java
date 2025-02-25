package org.example.abstractfactorypattern.transport;


public interface TransportFactory {
        Transport createFastTransport();
        Transport createHeavyTransport();
    }


