package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/recipeList")
public class recipeController {
	
	//レシピアプリの一覧画面を表示
	
	@GetMapping
	public String recipeList(Model model) {
		return "list";
	}
}
