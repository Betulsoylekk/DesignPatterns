package org.example.abstractfactorypattern.transport;

import org.springframework.stereotype.Component;

@Component
public class AsiaTransportFactory implements TransportFactory {
    @Override
    public Transport createFastTransport() {
        return new Motorbike();
    }

    @Override
    public Transport createHeavyTransport() {
        return new Truck();
    }
}

