package org.example.model;

public class Resource {

    private int id;
    private String title;
    private String type;
    private String shortDescription;
    private Category category;

    public Resource() {
    }

    public Resource(int id, String title, String type, String shortDescription, Category category) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.shortDescription = shortDescription;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}