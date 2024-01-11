package com.javaex.ex05;

public class Rectangle {

	private int width, height;

	public Rectangle() {

	}

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public boolean equals(Object obj) {

		Rectangle r = (Rectangle) obj;
		boolean result;

		if (this.height == r.height && this.width == r.width) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

}
