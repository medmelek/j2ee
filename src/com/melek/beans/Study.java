package com.melek.beans;

import java.util.ArrayList;

import java.util.List;

public class Study {
	
	private int code ;
	private List<String> cours = new ArrayList<String>() ;
	
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	
	public List<String> getCours() {
		return cours;
	}
	public void setCours(List<String> cours) {
		this.cours = cours;
	}
	
	
	public void ajouterCours(String cours) {
		this.cours.add(cours);
	}
	

}
