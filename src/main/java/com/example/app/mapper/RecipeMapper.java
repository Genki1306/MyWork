package com.example.app.mapper;

import java.util.List;

import com.example.app.domain.Recipe;



public interface RecipeMapper {
	
	//登録されているレシピを取得
	List<Recipe> selectRecipes();
	
	//レシピの追加
	void addRecipe(Recipe recipe);
	
	
}
