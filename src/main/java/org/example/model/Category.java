package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private int id;
    private String name;
    private String description;
    private List<Resource> resources;

    public Category() {
        this.resources = new ArrayList<>();
    }

    public Category(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.resources = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }
}