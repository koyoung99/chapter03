package com.javaex.ex04;

import java.util.Objects;

public class Rectangle {

	private int width, height;

	public Rectangle() {

	}

	public Rectangle(int width, int height) {
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

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(height, width);
	}

	@Override
	public boolean equals(Object obj) {

		Rectangle r = (Rectangle) obj;

		boolean result;

		if (this.width == r.width && this.height == r.height) {
			result = true;
		} else {
			result = false;
		}
		return result;

	}

}
