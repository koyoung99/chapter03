package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {

		Object obj = new Object();

		// 클래스 정보
		System.out.println(obj.getClass());

		// java.lang.Object@515f550a
		System.out.println(obj.toString());

		// 일단 주소라고 알자
		System.out.println(obj.hashCode());

		// 같은지 비교
		System.out.println(obj.equals(obj));

		System.out.println("============================");

		// 클래스 정보
		System.out.println(obj.getClass());

		// 클래스 정보 toString()
		System.out.println(obj.toString());
		System.out.println(obj);

		// hashCode()
		Object obj01 = new Object();
		Object obj02 = new Object();
		System.out.println(obj01.hashCode());
		System.out.println(obj02.hashCode());
		System.out.println(obj01.equals(obj02));

	}

}
