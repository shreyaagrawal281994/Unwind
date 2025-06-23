package com.unwind.app.services;

import com.unwind.app.entities.Source;
import com.unwind.app.repositories.SourceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SourceService {
    private final SourceRepository repository;

    public SourceService(SourceRepository repository) {
        this.repository = repository;
    }

    public List<Source> getAllSources() {
        return repository.findAll();
    }

    public Source addSource(Source source) {
        return repository.save(source);
    }

    public void deleteSource(Long id) {
        repository.deleteById(id);
    }
}

