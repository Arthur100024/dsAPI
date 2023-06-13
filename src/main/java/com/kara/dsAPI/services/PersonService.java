package com.kara.dsAPI.services;

import com.kara.dsAPI.models.Person;
import com.kara.dsAPI.repositories.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    public List<Person> showAllPersons(){
        return personRepository.findAll();
    }

    public Optional<Person> showPerson(String name){
        return personRepository.findByName(name);
    }
}
