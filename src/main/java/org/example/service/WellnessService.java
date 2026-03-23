package org.example.service;

import org.example.model.Category;
import org.example.model.Resource;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WellnessService {

    private final List<Category> categories = new ArrayList<>();
    private final List<Resource> resources = new ArrayList<>();

    @PostConstruct
    public void initData() {

        Category stress = new Category(1, "Stress Management", "Ways to manage stress.");
        Category anxiety = new Category(2, "Anxiety Support", "Strategies for anxiety.");
        Category sleep = new Category(3, "Sleep Wellness", "Improve sleep quality.");
        Category selfCare = new Category(4, "Self Care", "Daily mental health practices.");

        categories.add(stress);
        categories.add(anxiety);
        categories.add(sleep);
        categories.add(selfCare);

        Resource r1 = new Resource(1, "Breathing Exercises", "Article", "Calming breathing techniques.", stress);
        Resource r2 = new Resource(2, "Mindfulness Meditation", "Video", "Short meditation practice.", stress);
        Resource r3 = new Resource(3, "Grounding Techniques", "Guide", "Stay present during anxiety.", anxiety);
        Resource r4 = new Resource(4, "Understanding Anxiety", "Article", "Learn anxiety triggers.", anxiety);
        Resource r5 = new Resource(5, "Sleep Routine Tips", "Article", "Better sleep habits.", sleep);
        Resource r6 = new Resource(6, "Relax Before Bed", "Guide", "Relaxation techniques.", sleep);
        Resource r7 = new Resource(7, "Self Care Checklist", "Checklist", "Daily wellness habits.", selfCare);
        Resource r8 = new Resource(8, "Journaling", "Article", "Writing for mental health.", selfCare);
        Resource r9 = new Resource(9, "Nature Walks", "Article", "Outdoor benefits.", stress);
        Resource r10 = new Resource(10, "Positive Affirmations", "Guide", "Positive thinking practice.", selfCare);

        resources.add(r1);
        resources.add(r2);
        resources.add(r3);
        resources.add(r4);
        resources.add(r5);
        resources.add(r6);
        resources.add(r7);
        resources.add(r8);
        resources.add(r9);
        resources.add(r10);

        stress.getResources().add(r1);
        stress.getResources().add(r2);
        stress.getResources().add(r9);

        anxiety.getResources().add(r3);
        anxiety.getResources().add(r4);

        sleep.getResources().add(r5);
        sleep.getResources().add(r6);

        selfCare.getResources().add(r7);
        selfCare.getResources().add(r8);
        selfCare.getResources().add(r10);
    }

    public List<Resource> getAllResources() {
        return resources;
    }

    public List<Category> getAllCategories() {
        return categories;
    }

    public void addResource(Resource resource) {
        resource.setId(resources.size() + 1);
        resources.add(resource);
    }

    public Category findCategoryById(int id) {
        for (Category category : categories) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }
}