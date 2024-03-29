package com.javaex.ex03;

public class Point {

	private int x, y;

	public Point() {

	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public boolean equals(Object obj) {
		Point p = (Point) obj;

		boolean result;

		if (this.x == p.x && this.y == p.y) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}
