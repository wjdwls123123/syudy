package com.Test.statement;

public class ForStatementTest2 {

	public static void main(String[] args) {

		// 1~10사이의 있는 짝수를 더하시오
		System.out.println("1~10사이의 짝수를 더하시오.");
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.println("더해진 정수는 : " + i);
				sum = sum + i;
			}
		}
		System.out.println(sum);

		// 2단 구구단을 작성하시오.
		System.out.println("2단 구구단을 작성하시오.");
		int dan = 2;
		for (int gop = 1; gop < 10; gop++) {
			System.out.println(dan + "*" + gop + "=" + dan * gop);
		}

		// *구구단*
		// 단수반복
		for (int dann = 2; dann < 10; dann++) {
		}
		// 곱수반복
		for (int gopp = 1; gopp < 10; gopp++) {
		}
		
		// 구구단 완성
		for (int dann = 2; dann < 10; dann++) { //
			System.out.println(dann + "단입니다.");
			for (int gopp = 1; gopp < 10; gopp++)
				System.out.println(dann + "*" + gopp + "=" + dann * gopp);
		}
		// 별찍기
		char symbol = '*';
		for (int row = 1; row < 11; row++) {
			for (int num = 1; num < row + 1; num++) {
				System.out.print(symbol);
			}
			System.out.println();
		}

		// 별찍기 역삼각형
		int rows = 10;
		for (int roww = 1; roww < rows + 1; roww++) {
			for (int numm = 1; numm < rows - roww + 2; numm++) {
				System.out.print(symbol);
			}
			System.out.println();
	
		}
		
		
	}

}
