package com.kara.dsAPI.repositories;

import com.kara.dsAPI.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{
    Optional<Person> findByName(String name);
}
