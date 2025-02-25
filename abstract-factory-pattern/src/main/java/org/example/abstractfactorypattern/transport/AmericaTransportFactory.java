package org.example.abstractfactorypattern.transport;

import org.springframework.stereotype.Component;

@Component
public class AmericaTransportFactory implements TransportFactory {
    @Override
    public Transport createFastTransport() {
        return new Plane();
    }

    @Override
    public Transport createHeavyTransport() {
        return new Truck();
    }
}
