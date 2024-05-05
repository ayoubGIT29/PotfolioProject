package org.xproce.portfolio.metier;

import org.springframework.data.domain.Page;
import org.xproce.portfolio.dao.entities.Project;

public interface ProjectManager {
    Project addProject(Project project);
    Page<Project> getAllProjects(int page, int size);
    Project getProjectById(Long id);
    Project updateProject(Project project);
    boolean deleteProject(Long id);
}
