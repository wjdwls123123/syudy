package com.Test.statement;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		//도서관리 프로그램
		Scanner scan=new Scanner(System.in);
		
		System.out.println("*** 도서 관리 프로그램 ***");
		System.out.println("[1]로그인");
		System.out.println("[2]회원가입");
		System.out.println("[3]아이디/패스워드찾기");
		System.out.println("[4]종료");
		System.out.println("메뉴를 선택하세요._");
		
		String menu = scan.nextLine();
		String msg="";
		switch (menu) {
		case "1":
			msg="로그인 선택하셨습니다.";
			break;
		case "2":
			msg="회원가입을 선택하셨습니다.";
			break;
		case "3":
			msg="아이디/패스워드 찾기를 선택하셨습니다.";
			break;
		case "4":
			msg="프로그램을 종료합니다..";
			System.out.println(msg);
			return ;
		default:
			msg="메뉴 선택이 올바르지 않습니다.";
		}
		System.out.println(msg);
		
		
		
	}

}
