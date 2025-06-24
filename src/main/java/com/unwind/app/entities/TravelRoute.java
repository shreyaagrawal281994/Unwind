package com.unwind.app.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "travel-route")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TravelRoute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Join to country table using ISO code
    @ManyToOne
    @JoinColumn(name = "source_country_code", referencedColumnName = "code")
    private Country sourceCountry;

    @ManyToOne
    @JoinColumn(name = "destination_country_code", referencedColumnName = "code")
    private Country destinationCountry;

    // Other fields like routeType, travelTime, etc.

    // Getters & Setters
}
