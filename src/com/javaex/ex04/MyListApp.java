package com.javaex.ex04;

import java.util.ArrayList;

public class MyListApp {

	public static void main(String[] args) {

		// ctrl + shift + o --> import 자동으로 하는 방법

		ArrayList<Point> pList = new ArrayList<Point>();

		Point p01 = new Point(3, 5);
		Point p02 = new Point(13, 15);
		Point p03 = new Point(113, 115);

		pList.add(p01);
		pList.add(p02);
		pList.add(p03);

		System.out.println(pList.size());
		System.out.println(pList.get(0).getX());
		System.out.println(pList.get(0).getY());
		System.out.println(pList.get(0).toString());
		System.out.println("=====================");
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		//인덱스 1번방 지움 
		pList.remove(1);
		System.out.println("=====================");
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
	}

}
