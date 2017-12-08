package com.string.test;

public class StringTest {

	public static void main(String[] args) {

		// String 문자가여러개 모여서 만들어진 클래스 (타입 - 배열)

		String msg = "반갑습니다."; // string 문을 써서 변수(msg)지정과 초기화

		// string 클래스에 메서드 사용법
		System.out.println(msg); // 변수값 출력
		System.out.println("문자열길이 :" + msg.length()); // length : 메모리 길이 출력
		System.out.println("문자열 비교 :" + msg.equals("바바바")); // equals : 하나의
															// 문자열이라도 틀리면
															// false!!
		System.out.println("문자탐색 :" + msg.contains("반갑")); // contains : 하나의
															// 문자열이라도 맞으면 frue
		System.out.println("비교 인덱스 반환 :" + msg.indexOf("니다"));
		// indexOf "반갑습니다"의 글자순서부터 니다까지의 순서를 앞글자 니까지오는 순서기준으로 0,1,2,3의 3값을 출력
		System.out.println("index의 글자 반환 :" + msg.charAt(2)); // charAt : 지정된
																// 숫자의 문자열 첫부분을
																// 0을 기준으로 2번째의
																// 값을 출력
		System.out.println("빈물자열 확인 :" + msg.isEmpty()); // isEm0pty :
		System.out.println("문자열 교체 :" + msg.replace("반갑습", "감사함"));
		System.out.println("문자열 잘라내기 :" + msg.substring(0, 3)); // index 0~3의 값의
																// msg를 나타냄
		System.out.println("대문자 변환 :" + msg.toUpperCase());
		System.out.println("소문자 변환 :" + msg.toLowerCase()); // 메서드 앞에 to 가 붙으면
															// ~~로 변환한다는 뜻

		boolean isNumber = true; //
		msg = "49332135";
		for (int index = 0; index < msg.length(); index++) {
			System.out.println(msg.charAt(index));
			char ch = msg.charAt(index);
			if (!(ch >= 48 && ch <= 57))
				;
			{
				isNumber = false;
			}

		}
		System.out.println(isNumber ? "숫자" : "숫자가 아님");

	}

}
