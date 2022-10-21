package com.example.app.domain;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Recipe {
	
	private int id;
	private String category;
	private String title;
	private String content;
	private Timestamp update_datetime;
}
