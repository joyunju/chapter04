package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;
//import java.util.LinkedList;

public class MyListApp {

	public static void main(String[] args) {

		// ctrl(command) + shift + o --> import 자동으로 하는 방법
		// LinkedList<Point> pList = new LinkedList<Point>();
		// List<Point> pList = new LinkedList<Point>();
		ArrayList<Point> pList = new ArrayList<Point>();
		//List<Point> pList = new ArrayList<Point>();

		Point p01 = new Point(3, 5);
		Point p02 = new Point(13, 15);
		Point p03 = new Point(113, 115);

		Point p04 = new Point(100, 1);

		Circle c01 = new Circle(5);

		// add()를 이용해서 ArrayList에 아이템을 추가하는 코드

		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		// pList.add(c01); // : 원은 담을 수 없다.

		System.out.println(pList.size());
		System.out.println(pList.get(0).getX());
		System.out.println(pList.get(0).getY());
		System.out.println(pList.get(0).toString());
		System.out.println("=====================");
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}

		// 인덱스 1번방 지움
		pList.remove(1);
		// pList.remove(p02);
		System.out.println("=====================");
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}

		// toString 으로 값 다 찍어보기
		System.out.println("======================");
		System.out.println(pList.toString()); // Point toString()과 구분할 것

		System.out.println("======================");
		// for문의 다른 표현 : 향상된 for문 (어려우면 위에것 쓰면댐)
		for (Point p : pList) {
			// Point p :pList -> 담을 변수 : 전체 길이
			System.out.println(p.toString());
			System.out.println(p.getX());
			System.out.println(p.getY());
		}

		// p04를 2번째(방번호 1번[1])에 추가 하고 싶음
		// pList.add(p04)
		pList.add(1, p04);
		System.out.println(pList.toString());

	}

}
