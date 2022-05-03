// HashSet 을 이용하여 미니로또 만들기
// 1~45 까지의 숫자중 임의의 6개의 숫자를 출력하세요
// (HashSet을 사용하여 중복제거)

package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {

		// 문제풀이
		// set을 만든다
		Set<Integer> hashSetLotto = new HashSet<Integer>();

		// 반복한다(Set)의 개수가 6개보다 작을때까지
//		while (hashSetLotto.size() < 6) { 
//			// 번호를 생성한다.
//			// Set에 add 한다.
//			hashSetLotto.add((int) (Math.random() * 45) + 1);
//		}
		// System.out.println(hashSetLotto);
		
		while (true) {
			if (hashSetLotto.size() >= 6) {
				break;
			}

			// 번호를 생성한다.
			int num = (int) (Math.random() * 45) + 1;
			// 중복 체크를 위해 번호를 다 찍어본다.
			// System.out.println(num);

			// set에 add한다
			hashSetLotto.add(num);
		}

		System.out.println("=============");
		for (Integer num : hashSetLotto) {
			System.out.print(num + "\t");
		}

	}

}
