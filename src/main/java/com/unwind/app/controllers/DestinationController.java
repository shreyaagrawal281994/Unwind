package com.unwind.app.controllers;

import com.unwind.app.entities.Destination;
import com.unwind.app.services.DestinationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/destinations")
public class DestinationController {

    private final DestinationService service;

    public DestinationController(DestinationService service) {
        this.service = service;
    }

    @GetMapping
    public List<Destination> getDestinations() {
        return service.getAllDestinations();
    }

    @PostMapping
    public Destination createDestination(@RequestBody Destination destination) {
        return service.addDestination(destination);
    }

    @DeleteMapping("/{id}")
    public void deleteDestination(@PathVariable Long id) {
        service.deleteDestination(id);
    }
}
