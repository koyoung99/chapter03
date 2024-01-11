package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {

		Point p01 = new Point(3, 5);
		Point p02 = new Point(3, 5);
		Point p03 = new Point(13, 15);
		Point p04 = p03;

		System.out.println(p01.equals(p02));
		System.out.println(p01 == p02);

		System.out.println(p02.equals(p03));
		System.out.println(p03.equals(p04));
	}

}
