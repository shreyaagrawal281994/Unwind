package com.unwind.app.services;

import com.unwind.app.entities.Country;
import com.unwind.app.entities.Destination;
import com.unwind.app.entities.TravelRoute;
import com.unwind.app.repositories.CountryRepository;
import com.unwind.app.repositories.DestinationRepository;
import com.unwind.app.repositories.TravelRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TravelRouteService {

    private final TravelRepository travelRepository;
    private final CountryRepository countryRepository;
    private final DestinationRepository destinationRepository;

    public TravelRoute save(TravelRoute travelRoute) {
        Country destinationCountry = countryRepository.findByCode(travelRoute.getDestinationCountry().getCode());
        Country sourceCountry = countryRepository.findByCode(travelRoute.getSourceCountry().getCode());

        if (destinationCountry == null && sourceCountry == null) {
            System.out.println("Invalid input provided");
        }
        TravelRoute route = new TravelRoute();
        route.setDestinationCountry(destinationCountry);
        route.setSourceCountry(sourceCountry);
        route.setRouteType(travelRoute.getRouteType());
        route.setDistance(travelRoute.getDistance());
        route.setDurationInHours(travelRoute.getDurationInHours());
        return travelRepository.saveAndFlush(travelRoute);
    }

    public List<Destination> findAllDestinations() {
        return destinationRepository.findAllByOrderByPopularityAsc();
    }
}
