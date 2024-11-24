package com.cuvette.bankingApplication.models;

public class Service {
	
	private String name;
	private String description;
	
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Service(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
