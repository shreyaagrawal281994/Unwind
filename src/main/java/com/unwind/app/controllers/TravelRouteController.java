package com.unwind.app.controllers;

import com.unwind.app.entities.TravelRoute;
import com.unwind.app.services.TravelRouteService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
