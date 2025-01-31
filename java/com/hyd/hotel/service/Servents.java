package com.hyd.hotel.service;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Servents {
	
    @Id
	String manager;
	String assistant;
	int charge;
	int fee;
	
	
	public Servents() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getAssistant() {
		return assistant;
	}

	public void setAssistant(String assistant) {
		this.assistant = assistant;
	}

	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Servents [manager=" + manager + ", assistant=" + assistant + ", charge=" + charge + ", fee=" + fee
				+ "]";
	}
}
