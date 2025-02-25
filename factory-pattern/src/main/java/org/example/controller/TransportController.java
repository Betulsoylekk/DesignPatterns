package org.example.controller;

import org.example.service.TransportService;
import org.example.transport.Transport;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TransportController {

    private final TransportService transportService;

    public TransportController(TransportService transportService) {
        this.transportService = transportService;
    }

    @GetMapping("/transport/{type}")
    public Transport getTransport(@PathVariable String type) {
        return transportService.getTransport(type); // Call service to get transport object
    }
}

