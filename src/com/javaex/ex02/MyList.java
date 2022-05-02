//■ 제네릭(Generic) 적용 전 : Object

package com.javaex.ex02;

public class MyList {

	// 필드
	private Object[] oArray;
	private int crtPos; // 현재 위치 // crtPos : 변수명

	// 생성자
	public MyList() {
		// 배열 3개 --> 원래는 만들지 않음
		oArray = new Object[3];
		crtPos = 0; // 현재위치를 위해 가상으로 만듬
	}

	// 메소드 - gs

	// 메소드 - 일반
	public void add(Object obj) {
		// 현재 배열 개수 +1
		// 기존 배열의 내용은 그대로 복사
		// 마지막방에 point 대입

		oArray[crtPos] = obj;
		crtPos = crtPos + 1; // crtPos++

	}

	public int size() {
		return crtPos;
	}

	public Object get(int index) {
		return oArray[index];
	}
}
