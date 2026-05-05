package com.codeforge.Administration_recipes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codeforge.Administration_recipes.models.Recipe;
import com.codeforge.Administration_recipes.repository.RecipeRepository;

@Service
public class RecipeService {

    private RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> getAll() {
        return this.recipeRepository.findAll();
    }

    public Recipe One() {
        return this.recipeRepository.findAll()
                .stream()
                .findFirst()
                .orElse(null);
    }

    public Recipe findById(int id) {
        return this.recipeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Recipe not found"));
    }

    public void addRecipe(Recipe recipe) {
        this.recipeRepository.save(recipe);
    }

    public void UpdateRecipe(int id, Recipe newRecipe) {
        Recipe recipe = this.recipeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Recipe not found"));

        if (recipe.getId() == newRecipe.getId()) {
            recipe.setName(newRecipe.getName());
            this.recipeRepository.save(recipe);
        }

    }

    public void deleteRecipe(int id) {
        this.recipeRepository.deleteById(id);
    }
}
