package org.example.abstractfactorypattern.controller;

import org.example.abstractfactorypattern.service.LogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/logistics")
public class LogisticsController {

    private final LogisticsService logisticsService;

    @Autowired
    public LogisticsController(LogisticsService logisticsService) {
        this.logisticsService = logisticsService;
    }

    @PostMapping("/deliver")
    public String deliverPackage(@RequestParam String region, @RequestParam boolean fast) {
        try {
            logisticsService.deliverPackage(region, fast);
            return "Package delivered successfully!";
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }
}
