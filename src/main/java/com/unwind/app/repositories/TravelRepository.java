package com.unwind.app.repositories;

import com.unwind.app.entities.TravelRoute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelRepository extends JpaRepository<TravelRoute, Long> {
}
