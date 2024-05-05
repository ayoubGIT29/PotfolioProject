package org.xproce.portfolio.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.portfolio.dao.entities.Technology;

public interface TechnologyRepository extends JpaRepository<Technology, Long> {
    // Define custom query methods if needed
}
