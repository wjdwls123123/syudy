package com.test.exercise;

import javax.print.DocFlavor.STRING;

public class EX04_1 {

	public static void main(String[] args) {
		//
		// 4-1 1.
		int x = 11; // 변수 x 에 11 초기화
		System.out.println(x > 10 && x < 20); // %%(and) 논리연산자 사용하여 비교값을 출력
		// 4-1 2. 
		char ch = '5'; // ch에 문제예제처럼 공백 초기화
		System.out.println(!(ch == ' ' || ch == '\t')); // ch는 ' ' 같거나 || ch는'\t'랑 같다 ( || (or)한쪽만 true여도 true (앞에 !부정이 들어가있으면 true 값을 부정하니까 false로 나옴
		// 4-1 3.
		System.out.println(ch == 'x' || ch == 'X'); // ch는 x와 같거나 ch는 x와 같을때 true 값을 출력
		// 4-1 4. 
		System.out.println(ch >= '0' && ch <= '9'); // ch가 o보다 큰숫자이거나 9보다 작을때 둘중에 하나라도 true면 true
		// 4-1 5. 
		System.out.println((ch >= 'a' && ch <= 'Z') || (ch >= 'A' && ch <= 'X')); //a ~ Z 까지는 영소문자의 조건 , A ~ X 까지는 대문자의 조건
		// 4-1 6. 
		int year = 2000; // 변수에 2000 초기화
		System.out.println(((year % 400) == 0) || ((year % 4) == 0 && (year % 100) != 0));
		// 변수에 400을 나눈 나머지값이 0과 같거나 변수에 4를 나눈 값이 0과 같을때 둘중에 하나만 true이거나 100으로 나머지값이 0과 같을때 0인값을 출력 값을 ! 으로 부정함
		// 4-1 7.
		boolean powerOn = false; //변수 powerOn 에 false 초기화
		System.out.println(!powerOn); //powerOn 을 부정함 현재값이 false 지만 부정되서 true 출력
		// 4-1 8.
		String str = "yes"; // 변수 str에 yes 초기화
		System.out.println(str.equals("yes")); 	// str의 입력된 "yes"가 equals 비교해서 같으면 true 틀리면 false

	}

}
