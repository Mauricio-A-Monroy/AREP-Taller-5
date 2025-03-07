package edu.escuelaing.arep.JPA.repository;

import edu.escuelaing.arep.JPA.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {
}
