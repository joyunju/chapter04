//HashSet 을 이용하여 Point관리하기

package com.javaex.ex08;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		
		Set<Point> pSet = new HashSet<Point>();
		
		Point p01 = new Point(1, 2);
		Point p02 = new Point(3, 6);
		Point p03 = new Point(5, 10);
		
		
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		
//		for (Point p: pSet) {
//			System.out.println(p.getX());
			//HashSet은 인덱스 방번호 순서의 개념이 없어서 랜덤으로 나온다.
//			System.out.println(p.toString());
//		}
		System.out.println(pSet.size());
		System.out.println(pSet.toString());
		System.out.println("===============");
		
		Point p04 = new Point(3, 6);  // p02 와 중복
		pSet.add(p04);
		System.out.println(pSet.toString());
		// (HashSet을 사용하여 중복제거, equals()재정의) 후 프린트 값 보면 중복값 안나옴 
		
		// hashCode()
		for(Point p : pSet) {
			System.out.println(pSet.hashCode());
		}

	}

}
