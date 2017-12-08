package com.Test.variable;

public class OpertorTest {

	public static void main(String[] args) {

		//단항연산자
		int i=0; // 변수 'i'선언과 0을 초기화
				
				
		//System.out.println("i="+i); 1로 증가된 값 바로적용 많이쓰는방법
		System.out.println("i+1="+(i++)); 	// 출력후 연산
		System.out.println("i="+i); 		// 연산된 값 출력
		
		
		i=i-1; // 변수값 i에 -1을 선언
		System.out.println("i-1="+i); //연산된 값 출력
		
		
		//산술연산자
		int x = 10, y = 20;			// 정수형에 x=10, y=2 각각 선언하고 초기화
		char ch = 'A';				// 문자형에 ch란 변수를 선언하고 A를 초기화 ('A' 아스키코드 65)
		ch = 65;					// 변수 ch에 초기화된 65는 문자형에서 초기화된 'A'의 아스키코드 값이므로 'A'가 그대로 사용됨

		int sum = x + y;			// 변수에 산술연산자 (+)덧셈 초기화
		int sub = x - y;			// 변수에 산술연산자 (-)뺄셈 초기화
		int multi = x * y;			// 변수에 산술연산자 (*)곱셈 초기화
		float div = x / (y * 1.0f);	// x와 y는 정수형 이므로 소수점을 나타내기위해 실수형 float 하고
									// 1.0 을 실수로 적용하기위해 뒷부분에 float의 약자 f를  붙임
		int mock = x / y;			// 변수에 산술연산자 (/)나눗셈을 넣고 int 자료형에따라 정수로 설정
		int namuji = x % y;			// x 와 y를 나눈 나머지값을 설정하는 산술연산자 (%)

		int chSumInt = ch + 3; 		// 초기화되있는 변수 ch에 산술연산자(+)3 덧셈
		char chSumInt2 = (char) chSumInt; 	// chSumInt 에 초기화되있는 68을 문자형(char)으로 바꿈

		System.out.println("x+y=" + sum);	// sum 에 적용된 값 출력
		System.out.println("x-y=" + sub);	// sub 에 적용된 값 출력
		System.out.println("x*y=" + multi);	// multi 에 적용된 값 출력
		System.out.println("x/y=" + div);	// div 에 적용된 값 출력
		System.out.println("mock:x/y=" + mock);	// mock 에 적용된 값 출력
		System.out.println("namuji : x/y=" + namuji); // namuji 에 적용된 값 출력
		System.out.println("chSumInt3 : char + int =" + chSumInt2); //chSumInt2 에 적용된 값 출력
		
		System.out.println("x > y :" + (x > y)); // x 가 크면 true 작으면 false
		System.out.println("x >= y :" + (x >= y)); // x 가 크거나 같으면 true 작으면 false
		System.out.println("x < y :" + (x < y)); // y 가 크면 true 작으면 false
		System.out.println("x <= y :" + (x <= y)); // y 가 크거나 같으면 true 작으면 false
		System.out.println("x == y :" + (x == y)); // x 와 y 값 같으면 true 틀리면 false
		System.out.println("x != y :" + (x != y)); // x 와 y 값 같지않으면 true 같으면 false

		// 삼항연산자
		// (조건식) ? A(true) : B(false)
		int kor = 92; // 자료형에 kor 변수 선언과 92를 초기화

		System.out.println("국어점수 레벨 : " + ((kor >= 90) ? "A" : "F")); // for 가 90보다 크거나 같으면 A 출력 틀리면 F 출력

		// 논리연산자
		int k = 9; 	// 자료형에 k 변수선언 9 초기화
		int l = 10; // 자료형에 l 변수선언 10 초기화

		System.out.println(k > 9 && (l = 11) > 10); // 비교해서 true 둘다틀리면 false
		System.out.println(l); // k가 false라 뒤를 안보고 10으로나옴
		System.out.println(k >= 9 && (l = 11) > 10); // 비교해서 true 둘다틀리면 false
		System.out.println(l); // k가 true라 11이 그대로 나오고 뒤를 봄

		l = 10; // 변수 'l'에 10 초기화

		System.out.println(k >= 9 || (l = 11) > 10); // 둘중에 하나라도 true면 true 둘다 아니면 false
		System.out.println(l); // 변경된 변수 'l'값 출력
		System.out.println(k > 9 || (l = 11) > 10); // 둘중에 하나라도 true면 true 둘다 아니면 false
		System.out.println(l); // 변경된 변수 'l'값 출력

		// 대입연산자

		int m = 0; // 자료형에 m 변수선언과 0 초기화
		m = m + 1; // 변수 m에 +1 초기화
		m = m + 1; // 변수 m에 +1 초기화
		m = m + 1; // 변수 m에 +1 초기화
		m = m + 1; // 변수 m에 +1 초기화
		System.out.println("m=m+1 : " + m); // 지정된 값에 m 변수 출력
	}

}