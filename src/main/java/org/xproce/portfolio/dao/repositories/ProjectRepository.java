package org.xproce.portfolio.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.portfolio.dao.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    // Define custom query methods if needed
}
