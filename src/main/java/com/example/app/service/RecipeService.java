package com.example.app.service;

import java.util.List;

import com.example.app.domain.Recipe;

public interface RecipeService {
	
	List<Recipe> getRecipeList() throws Exception;
}
