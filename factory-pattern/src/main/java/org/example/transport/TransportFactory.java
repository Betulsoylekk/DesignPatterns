package org.example.transport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransportFactory {

    private final Truck truck;
    private final Plane plane;
    private final Ship ship;

    @Autowired
    public TransportFactory(Truck truck, Plane plane, Ship ship) {
        this.truck = truck;
        this.plane = plane;
        this.ship = ship;
    }

    public Transport createTransport(String type) {
        return switch (type.toLowerCase()) {
            case "truck" -> truck;
            case "plane" -> plane;
            case "ship" -> ship;
            default -> throw new IllegalArgumentException("Invalid transport type: " + type);
        };
    }
}

