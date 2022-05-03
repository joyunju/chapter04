package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {

		// Set 특징
		// : 순서 없음 / 중복 저장 안됨
		// **중복값은 저장되지 않는다. 따라서 중복의 재정의가 필요하다.
		// **중복정의가 중요 : 클래스의 hashCode() 와 equals() 메소드 재정의 필요

		Set<Integer> iset = new HashSet<Integer>();
		// Set<int> iset = new HashSet<int>(); // 오류: boxing 에서는 기본자료형을 못씀 그래서 Integer
		// 이라고 써야함

		// int i = 12;
		// int i01 = new Integer(12);
		// boxing
		Integer i01 = 4;
		Integer i02 = 5;
		Integer i03 = 6;

		iset.add(i01);
		iset.add(i02);
		iset.add(i03);
		
		System.out.println(iset.size());   //3
		System.out.println(iset.toString());
		
//		for(int i =0; i<iset.size(); i++) {
//			
//		}
		System.out.println("=================");
		//향상된 for 문
		for(Integer num:iset) {
			System.out.println(num.toString());
		}
		
		System.out.println("=================");
	}

}
