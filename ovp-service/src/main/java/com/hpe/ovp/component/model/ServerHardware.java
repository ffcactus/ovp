package com.hpe.ovp.component.model;

public class ServerHardware {
	
	public ServerHardware() {
		
	}
	
	public ServerHardware(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
