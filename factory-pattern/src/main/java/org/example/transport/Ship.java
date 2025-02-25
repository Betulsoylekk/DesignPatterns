package org.example.transport;

import org.springframework.stereotype.Component;

@Component
public class Ship implements Transport {
    @Override
    public void deliver(String packageId) {
        System.out.println("🚢 Delivering package " + packageId + " by Ship.");
    }
}
