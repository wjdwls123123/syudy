package com.Test.array;

import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {

		String[] idArray = new String[100];
		String[] pwdArray = new String[100];

		idArray[0] = pwdArray[0] = "mimi";
		idArray[1] = pwdArray[1] = "mama";
		idArray[2] = pwdArray[2] = "mumu";

		String inputID = "";
		String inputPWD = "";

		int currentIndex = 3;

		Scanner scan = new Scanner(System.in);

		while (true) {
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
				System.out.println("로그인 선택하셨습니다.");
				System.out.print("아이디 : ");
				inputID = scan.nextLine();
				int findIndex = -1;
				for (int index = 0; index < currentIndex; index++) { // 검색을 위한
																		// index
					if (inputID.equals(idArray[index])) {
						findIndex = index;
						break;
					}
				}
				if (findIndex > -1) {
					System.out.print("패스워드 : ");
					inputPWD = scan.nextLine();
					if (inputPWD.equals(pwdArray[findIndex])) {
						System.out.println("로그인에 성공하셧습니다.\n");
					} else { // 패스워드 불일치
						System.out.println("패스워드가 일치하지 않습니다.");
					}
				} else { // 존재하지않는 아이디
					System.out.println("아이디가 일치하지않습니다.");
				}
				break;
			case "2":
				System.out.println("회원가입을 선택하셨습니다.\n");

				System.out.print("아이디 : ");
				inputID = scan.nextLine();

				if (currentIndex >= idArray.length) { // 아이디가 있는지 확인
					String[] temp = new String[idArray.length + 20];
					for (int i = 0; i < idArray.length; i++) {
						temp[i] = idArray[i];
					}
					idArray = temp;
				}

				boolean exsistID = false;

				for (int i = 0; i < idArray.length; i++) { // 아이디 중복확인
					if (inputID.equals(idArray[i])) {
						exsistID = true;
					}
				}

				if (!exsistID) {
					System.out.print("패스워드 : ");
					inputPWD = scan.nextLine();
					idArray[currentIndex] = inputID;
					pwdArray[currentIndex] = inputPWD;
					currentIndex++;
					System.out.println("가입에 성공했습니다. ");
				} else {
					System.out.println("중복된 아이디 입니다. ");
				}

				break;
			case "3":
				msg = "아이디/패스워드 찾기를 선택하셨습니다.";
				break;
			case "4":
				msg = "프로그램을 종료합니다..";
				System.out.println(msg);
				return;
			default:
				msg = "메뉴 선택이 올바르지 않습니다.";
			}
			System.out.println(msg);
		}
	}

}
