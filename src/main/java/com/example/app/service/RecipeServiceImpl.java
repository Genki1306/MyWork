package com.example.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.app.domain.Recipe;
import com.example.app.mapper.RecipeMapper;

@Service
@Transactional(rollbackFor = Exception.class)
public class RecipeServiceImpl implements RecipeService{
	
	@Autowired
	RecipeMapper recipeMapper;

	@Override
	public List<Recipe> getRecipeList() throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return recipeMapper.selectRecipes();
	}
	
	
}
