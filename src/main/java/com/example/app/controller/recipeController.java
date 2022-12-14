package com.example.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.app.service.RecipeService;

@Controller
@RequestMapping("/campRecipe")
public class RecipeController {
	
	//レシピアプリの一覧画面を表示
	
	@Autowired
	RecipeService service;
	
	@GetMapping
	public String recipeList(Model model) throws Exception{
		model.addAttribute("recipe", service.getRecipeList());
		
		return "list";
	}
	
	//詳細ページの表示
	@GetMapping("/details/{id}")
	public String details(@PathVariable int id, Model model)
						throws Exception{
		return "details";
	}
	
	//レシピ追加ページの表示
	@GetMapping("/add")
	public String add(Model model) throws Exception{
		
		return "add";
	}
	
	
}
