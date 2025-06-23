package com.unwind.app.controllers;

import com.unwind.app.entities.Source;
import com.unwind.app.services.SourceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sources")
public class SourceController {

    private final SourceService service;

    public SourceController(SourceService service) {
        this.service = service;
    }

    @GetMapping
    public List<Source> getSources() {
        return service.getAllSources();
    }

    @PostMapping
    public Source createSource(@RequestBody Source source) {
        return service.addSource(source);
    }

    @DeleteMapping("/{id}")
    public void deleteSource(@PathVariable Long id) {
        service.deleteSource(id);
    }
}

