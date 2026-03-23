package org.example.controller;

import org.example.model.Category;
import org.example.model.Resource;
import org.example.service.WellnessService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ResourceController {

    private final WellnessService wellnessService;

    public ResourceController(WellnessService wellnessService) {
        this.wellnessService = wellnessService;
    }

    @GetMapping("/resources")
    public String showResources(Model model) {
        model.addAttribute("resources", wellnessService.getAllResources());
        return "resources";
    }

    @GetMapping("/resources/add")
    public String showAddForm(Model model) {
        model.addAttribute("categories", wellnessService.getAllCategories());
        return "add-resource";
    }

    @PostMapping("/resources/add")
    public String addResource(@RequestParam String title,
                              @RequestParam String type,
                              @RequestParam String shortDescription,
                              @RequestParam int categoryId) {

        Category category = wellnessService.findCategoryById(categoryId);

        Resource resource = new Resource();
        resource.setTitle(title);
        resource.setType(type);
        resource.setShortDescription(shortDescription);
        resource.setCategory(category);

        wellnessService.addResource(resource);

        return "redirect:/add/success/resource";
    }

    @GetMapping("/add/success/{entityName}")
    public String success(@PathVariable String entityName, Model model) {
        model.addAttribute("entityName", entityName);
        return "success";
    }
}