package org.example.service;

import org.springframework.stereotype.Service;
import org.example.transport.Transport;
import org.example.transport.TransportFactory;


@Service
public class TransportService {

    private final TransportFactory transportFactory;

    public TransportService(TransportFactory transportFactory) {
        this.transportFactory = transportFactory;
    }

    public Transport getTransport(String type) {
        return transportFactory.createTransport(type);  // Using the factory to get the appropriate transport
    }
}

