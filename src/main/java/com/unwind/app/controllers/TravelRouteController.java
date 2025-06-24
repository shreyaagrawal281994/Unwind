package com.unwind.app.controllers;

import com.unwind.app.entities.Destination;
import com.unwind.app.entities.TravelRoute;
import com.unwind.app.services.TravelRouteService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "unwind/api/v1")
@AllArgsConstructor
public class TravelRouteController {

    private final TravelRouteService travelRouteService;

    @PostMapping(value = "/route")
    public ResponseEntity<TravelRoute> save(@RequestBody TravelRoute travelRoute) {
        TravelRoute response = travelRouteService.save(travelRoute);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping(value = "/destinations")
    public ResponseEntity<List<Destination>> find() {
        List<Destination> destinations = travelRouteService.findAllDestinations();
        return ResponseEntity.ok().body(destinations);
    }
}
