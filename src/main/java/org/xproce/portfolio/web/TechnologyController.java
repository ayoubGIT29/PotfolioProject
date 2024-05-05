package org.xproce.portfolio.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.xproce.portfolio.dao.entities.Technology;

@Controller
public class TechnologyController {

    @GetMapping("/technologies")
    public String showTechnologies(Model model) {
        // Logic to fetch and pass technologies to the view
        return "technologies";
    }

    @GetMapping("/technologies/{technologyId}")
    public String showTechnologyDetails(@PathVariable("technologyId") Long technologyId, Model model) {
        // Logic to fetch technology details by technologyId and pass to the view
        return "technology_details";
    }

    @GetMapping("/technologies/add")
    public String showAddTechnologyForm(Model model) {
        // Logic to prepare data for adding a new technology and pass to the view
        model.addAttribute("technology", new Technology());
        return "add_technology";
    }

    @PostMapping("/technologies")
    public String addTechnology(@ModelAttribute Technology technology) {
        // Logic to add a new technology
        return "redirect:/technologies";
    }

    @GetMapping("/technologies/{technologyId}/edit")
    public String showEditTechnologyForm(@PathVariable("technologyId") Long technologyId, Model model) {
        // Logic to fetch technology details by technologyId and pass to the edit form
        return "edit_technology";
    }

    @PostMapping("/technologies/{technologyId}/edit")
    public String editTechnology(@PathVariable("technologyId") Long technologyId, @ModelAttribute Technology technology) {
        // Logic to update the technology details
        return "redirect:/technologies/{technologyId}";
    }

    @PostMapping("/technologies/{technologyId}/delete")
    public String deleteTechnology(@PathVariable("technologyId") Long technologyId) {
        // Logic to delete the technology
        return "redirect:/technologies";
    }
}
