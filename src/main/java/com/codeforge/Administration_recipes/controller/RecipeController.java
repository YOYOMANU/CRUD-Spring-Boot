package com.codeforge.Administration_recipes.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.codeforge.Administration_recipes.models.Recipe;
import com.codeforge.Administration_recipes.service.RecipeService;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RecipeController {

    private RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/home")
    public String Home(Model model) {
        List<Recipe> recipes = this.recipeService.getAll();
        model.addAttribute("recipes", recipes);
        return "index";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        Recipe recipe = new Recipe();
        model.addAttribute("recipe", recipe);
        return "add";
    }

    @PostMapping("/add")
    public String createRecipe(@ModelAttribute Recipe recipe, RedirectAttributes redirectAttributes) {
        this.recipeService.addRecipe(recipe);
        redirectAttributes.addFlashAttribute("success", "La recette a été créée avec succès");
        return "redirect:/home";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        System.err.println("world");
        Recipe recipe = this.recipeService.findById(id);
        model.addAttribute("recipe", recipe);
        return "edit";
    }

    @PostMapping("/edit/{id}")
    public String updateRecide(@PathVariable int id, @ModelAttribute Recipe recipe,
            RedirectAttributes redirectAttributes) {
        this.recipeService.UpdateRecipe(id, recipe);
        redirectAttributes.addFlashAttribute("success", "La recette a bien été modifiée");
        return "redirect:/home";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteRecipe(@PathVariable int id, RedirectAttributes redirectAttributes) {
        this.recipeService.deleteRecipe(id);
        redirectAttributes.addFlashAttribute("success", "La recette a été supprimée avec succèss");
        return "redirect:/home";
    }

}
