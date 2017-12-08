package com.Test.Quiz;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] idArray = new String[100];	// 배열 설정하고 100을 줌
		idArray[0] = "mimi";
		idArray[1] = "mama";
		idArray[2] = "mumu";
		String[] pweArray = new String[100]; // 배열 설정하고 100을 줌
		pweArray[0] = "mimi";
		pweArray[1] = "mama";
		pweArray[2] = "mumu";

		String id = " ";
		String pw = " ";

		int i = 3;

		while (true) { // 항상 참일수있게 true 조건을 줌

			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("[1]로그인");
			System.out.println("[2]회원가입");
			System.out.println("[3]아이디/패스워드찾기");
			System.out.println("[4]종료");
			System.out.println("메뉴를 선택하세요._");
			String menu = scan.nextLine();
			String msg = "";

			switch (menu) {

			case "1":
				msg = "로그인을 선택하셨습니다.";
				System.out.println("아이디 입력 : ");
				id = scan.nextLine();	// id 문자열 입력
				System.out.println("패스워드 입력 : ");
				pw = scan.nextLine();	// pw 문자열 입력
				for (int num = 0; num < i; num++) {		// num 값이 0이고 i보다 클때까지 후증가한다
					if (id.equals(idArray[num])) {		// id를 equals 로 하여 입력했을때 배열 속에있는 num값이랑 비교
						if (pw.equals(pweArray[num])) {	// pw를 equals 로 하여 입력했을때 배열 속에있는 num값이랑 비교
							System.out.println("로그인을 성공하셧습니다.");	// 문자열 출력
							break;
						} else {
							System.out.println("로그인을 실패하셧습니다.");	// 문자열 출력
							break;
						} 
					}else if (num == i){
						System.out.println("로그인을 실패하셧습니다.");
						break;
					}
					
				}
			

				break;
			case "2":
				msg = "회원가입을 선택하셨습니다.";
				System.out.println("아이디 : "); 
				idArray[i] = scan.nextLine();	// idArray 배열에 i값을 넣을때마다 증가시킴
				System.out.println("패스워드 : ");
				pweArray[i] = scan.nextLine();	// pweArray 배열에 i값을 넣을때마다 증가시킴
				System.out.println("회원가입을 성공하셧습니다.");
				System.out.println();
				i++;	// i값 후증가
				break;
			case "3":
				msg = "아이디/패스워드 찾기를 선택하셨습니다.";
				break;
			case "4": 
				msg = "프로그램을 종료합니다..";
				System.out.println(msg);
				return; // 반복문을 모두 종료시키고 끝냄
			default:
				msg = "메뉴 선택이 올바르지 않습니다.";
			} // switch문 종료

		} // while문 종료
	}

}
