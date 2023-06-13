package com.kara.dsAPI.services;

import com.kara.dsAPI.models.Location;
import com.kara.dsAPI.models.Person;
import com.kara.dsAPI.repositories.LocationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LocationService {
    private final LocationRepository locationRepository;

    public List<Location> showAllLocations(){
        return locationRepository.findAll();
    }

    public Optional<Location> showLocation(String title){
        return locationRepository.findByTitle(title);
    }
}
