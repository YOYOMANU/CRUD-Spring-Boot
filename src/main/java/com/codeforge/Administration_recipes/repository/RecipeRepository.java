package com.codeforge.Administration_recipes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codeforge.Administration_recipes.models.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer> {

}
