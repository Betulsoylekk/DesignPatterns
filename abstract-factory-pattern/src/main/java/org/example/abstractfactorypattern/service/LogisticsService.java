package org.example.abstractfactorypattern.service;

import org.example.abstractfactorypattern.transport.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogisticsService {

    private final AsiaTransportFactory asiaFactory;
    private final EuropeTransportFactory europeFactory;
    private final AmericaTransportFactory americaFactory;

    @Autowired
    public LogisticsService(AsiaTransportFactory asiaFactory, EuropeTransportFactory europeFactory, AmericaTransportFactory americaFactory) {
        this.asiaFactory = asiaFactory;
        this.europeFactory = europeFactory;
        this.americaFactory = americaFactory;
    }

    public void deliverPackage(String region, boolean fast) {
        TransportFactory factory = switch (region.toLowerCase()) {
            case "asia" -> asiaFactory;
            case "europe" -> europeFactory;
            case "america" -> americaFactory;
            default -> throw new IllegalArgumentException("Invalid region: " + region);
        };

        Transport transport = fast ? factory.createFastTransport() : factory.createHeavyTransport();
        transport.deliver("Order123");
    }
}
