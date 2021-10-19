package com.example.tp_spring.repositories;

import com.example.tp_spring.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
