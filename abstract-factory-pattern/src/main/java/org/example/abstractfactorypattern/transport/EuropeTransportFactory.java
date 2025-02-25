package org.example.abstractfactorypattern.transport;

import org.springframework.stereotype.Component;

@Component
public class EuropeTransportFactory implements TransportFactory {
    @Override
    public Transport createFastTransport() {
        return new Train();
    }

    @Override
    public Transport createHeavyTransport() {
        return new Truck();
    }
}
