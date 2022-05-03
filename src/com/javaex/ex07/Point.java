
package com.javaex.ex07;

import java.util.Objects;

public class Point {

	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {

	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	// 메소드 - gs
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 메소드 - 일반

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	// hashCode()재정의
	@Override
	public int hashCode() {
		int hashCode = x + y;
		return hashCode;
	}

	// equals()재정의
	@Override
	public boolean equals(Object obj) {
		Point p = (Point) obj;

		if ((this.x == p.x) && (this.y == p.y)) {
			return true;
		}else {
			return false;
		}
	}
	

}
