package com.hyd.hotel.repo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Desserts {
    @Id
	String sweets;
	String icecreams;
	String fruits;
	
	
	public Desserts() {
	}  
	
	
	
	public String getSweets() {
		return sweets;
	}
	public void setSweets(String sweets) {
		this.sweets = sweets;
	}
	public String getIcecreams() {
		return icecreams;
	}
	public void setIcecreams(String icecreams) {
		this.icecreams = icecreams;
	}
	public String getFruits() {
		return fruits;
	}
	public void setFruits(String fruits) {
		this.fruits = fruits;
	}
	
	@Override
	public String toString() {
		return "Desserts [sweets=" + sweets + ", icecreams=" + icecreams + ", fruits=" + fruits + "]";
	}
	
	
	
	
	
}
