package com.example.java_guides_dto_tutorial.repository;

import com.example.java_guides_dto_tutorial.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
