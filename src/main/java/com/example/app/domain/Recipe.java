package com.example.app.domain;


import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class Recipe {
	
	private int id;
	private String category;
	
	@NotBlank
	private String title;
	private String content;
	private String update_datetime;
}
