package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {

		Point p01 = new Point(3, 5);
		Point p02 = new Point(4, 6);
		Point p03 = new Point(5, 7);

		System.out.println("=====getClass()================");
		System.out.println(p01.getClass());
		System.out.println(p02.getClass());
		System.out.println(p03.getClass());

		System.out.println("=====toString()================");
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		System.out.println(p03.toString());

		System.out.println("=====hashCode()================");
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		System.out.println(p03.hashCode());

		System.out.println("=====equals()================");
		System.out.println(p01.equals(p02));
		System.out.println(p02.equals(p01));
		System.out.println(p03.equals(p03));
	
	}

}
