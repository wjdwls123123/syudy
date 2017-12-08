package com.Test.variable;

public class Global_Local_Variable_Test {
	
	static int x=10; // 전역 변수 선언 (클래스변수)

	public static void main(String[] args) {
		
		int x=10000; // 지역 번수 선언 (메서드변수)
		
		System.out.println(x); // 지역변수를 먼저 가져오지만 없으면 전역 변수를 가져옴
							   // 반대의 경우는 가져올수 없다.
	}

}
