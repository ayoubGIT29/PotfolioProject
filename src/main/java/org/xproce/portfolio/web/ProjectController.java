package org.xproce.portfolio.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.xproce.portfolio.dao.entities.Project;
@Controller
public class ProjectController {

    @GetMapping("/projects")
    public String showProjects(Model model) {
        // Logic to fetch and pass projects to the view
        return "projects";
    }

    @GetMapping("/projects/{projectId}")
    public String showProjectDetails(@PathVariable("projectId") Long projectId, Model model) {
        // Logic to fetch project details by projectId and pass to the view
        return "project_details";
    }

    @GetMapping("/projects/add")
    public String showAddProjectForm(Model model) {
        // Logic to prepare data for adding a new project and pass to the view
        return "add_project";
    }

    @PostMapping("/projects")
    public String addProject(@ModelAttribute Project project) {
        // Logic to add a new project
        return "redirect:/projects";
    }

    @GetMapping("/projects/{projectId}/edit")
    public String showEditProjectForm(@PathVariable("projectId") Long projectId, Model model) {
        // Logic to fetch project details by projectId and pass to the edit form
        return "edit_project";
    }

    @PostMapping("/projects/{projectId}/edit")
    public String editProject(@PathVariable("projectId") Long projectId, @ModelAttribute Project project) {
        // Logic to update the project details
        return "redirect:/projects/{projectId}";
    }

    @PostMapping("/projects/{projectId}/delete")
    public String deleteProject(@PathVariable("projectId") Long projectId) {
        // Logic to delete the project
        return "redirect:/projects";
    }
}
