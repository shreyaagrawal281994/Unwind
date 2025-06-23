package com.unwind.app.services;

import com.unwind.app.entities.Destination;
import com.unwind.app.repositories.DestinationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinationService {
    private final DestinationRepository repository;

    public DestinationService(DestinationRepository repository) {
        this.repository = repository;
    }

    public List<Destination> getAllDestinations() {
        return repository.findAll();
    }

    public Destination addDestination(Destination destination) {
        return repository.save(destination);
    }

    public void deleteDestination(Long id) {
        repository.deleteById(id);
    }
}

