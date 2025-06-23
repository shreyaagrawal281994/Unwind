package com.unwind.app.repositories;

import com.unwind.app.entities.Destination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinationRepository extends JpaRepository<Destination, Long> {
}
