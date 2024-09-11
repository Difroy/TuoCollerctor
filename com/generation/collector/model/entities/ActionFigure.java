package com.generation.collector.model.entities;

public class ActionFigure extends Product {

	
	protected int height, width;
	protected String material;
	
	public ActionFigure(int id, int value, String name, String description, int height, int width, String material) {
		super(id, value, name, description);
		
		this.height = height;
		this.width = width;
		this.material = material;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
}

