package com.kara.dsAPI.controllers;

import com.kara.dsAPI.models.Location;
import com.kara.dsAPI.models.Person;
import com.kara.dsAPI.services.LocationService;
import com.kara.dsAPI.services.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class MainController {

    private final LocationService locationService;
    private final PersonService personService;

    @GetMapping("/locations")
    public List<Location> showLocations(){
        return locationService.showAllLocations();
    }

    @GetMapping("/locations/{title}")
    public Optional<Location> showLocation(@PathVariable("title") String title){
        return locationService.showLocation(title);
    }

    @GetMapping("/persons")
    public List<Person> showPersons(){
        return personService.showAllPersons();
    }

    @GetMapping("/persons/{name}")
    public Optional<Person> showPerson(@PathVariable("name") String name){
        return personService.showPerson(name);
    }
}
