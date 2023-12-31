package com.kara.dsAPI.repositories;

import com.kara.dsAPI.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer>{
    Optional<Location> findByTitle(String title);
}
