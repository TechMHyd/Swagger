package com.swiggy.domain;

public class MenuItem {

	private int id;
	private String itemName;
	private String description;
	private boolean isVeg;
	private int cost;
	
	public MenuItem(int id, String itemName, String description, boolean isVeg, int cost) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.description = description;
		this.isVeg = isVeg;
		this.cost = cost;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isVeg() {
		return isVeg;
	}
	public void setVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
}
