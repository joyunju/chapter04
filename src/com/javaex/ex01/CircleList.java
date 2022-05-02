package com.javaex.ex01;

public class CircleList {
		
	//필드
	private Circle[] cArray;
	private int crtPos;
	
	//생성자
	public CircleList() {
		// 배열 3개 --> 원래는 만들지 않음
		cArray = new Circle[3];
		crtPos = 0; // 현재위치를 위해 가상으로 만듬
	}
	
	//메소드 - gs
	
	
	//메소드 - 일반
	public void add(Circle circle) {
		// 현재 배열 개수 +1
		// 기존 배열의 내용은 그대로 복사
		// 마지막방에 point 대입

		cArray[crtPos] = circle;
		crtPos = crtPos + 1; // crtPos++

	}
	public int size() {
		return crtPos;
	}

	public Circle get(int index) {
		return cArray[index];
	}
	
}
