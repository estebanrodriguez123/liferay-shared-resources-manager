package com.rivetlogic.assetmanagement.model.impl;

public enum AssetStatus {

	AVAILABLE("available", "green"), BOOKED("booked","red"), ASSIGNED("assigned","blue");

	private String name;
	private String color;

	AssetStatus(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
}