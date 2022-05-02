// 제네릭(Generic)

package com.javaex.ex01;

public class MyListApp {

	public static void main(String[] args) {

		Point[] pArray = new Point[100]; // 갯수를 미리 정해야 된다

		Point p00 = new Point(2, 3);
		Point p01 = new Point(12, 13);
		Point p02 = new Point(22, 23);

		// 배열에 넣기
		pArray[0] = p00;
		pArray[1] = p01;
		pArray[2] = p02;

		for (int i = 0; i < pArray.length; i++) {
			System.out.println(pArray[i].toString());
			//pArray[2] 까지값이 있으니까 그 3-100번까지 값이 없어서 NullPointerException 오류 발생
		}
		
		
	}

}
