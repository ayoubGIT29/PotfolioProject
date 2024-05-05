package org.xproce.portfolio.metier;

import org.springframework.data.domain.Page;
import org.xproce.portfolio.dao.entities.Technology;

public interface TechnologyManager {
    Technology addTechnology(Technology technology);
    Page<Technology> getAllTechnologies(int page, int size);
    Technology getTechnologyById(Long id);
    Technology updateTechnology(Technology technology);
    boolean deleteTechnology(Long id);
}
