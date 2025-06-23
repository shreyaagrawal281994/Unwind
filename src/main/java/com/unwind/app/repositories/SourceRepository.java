package com.unwind.app.repositories;

import com.unwind.app.entities.Source;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SourceRepository extends JpaRepository<Source, Long> {
}
