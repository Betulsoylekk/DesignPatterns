package org.example.abstractfactorypattern.transport;

import org.springframework.stereotype.Component;

@Component
public class Train implements Transport {
    @Override
    public void deliver(String packageId) {
        System.out.println("🚆 Delivering package " + packageId + " by Train.");
    }
}

