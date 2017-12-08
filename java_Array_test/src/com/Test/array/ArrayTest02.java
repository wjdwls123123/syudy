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
			System.out.println("*** ���� ���� ���α׷� ***");
			System.out.println("[1]�α���");
			System.out.println("[2]ȸ������");
			System.out.println("[3]���̵�/�н�����ã��");
			System.out.println("[4]����");
			System.out.println("�޴��� �����ϼ���._");

			String menu = scan.nextLine();
			String msg = "";
			switch (menu) {
			case "1":
				System.out.println("�α��� �����ϼ̽��ϴ�.");
				System.out.print("���̵� : ");
				inputID = scan.nextLine();
				int findIndex = -1;
				for (int index = 0; index < currentIndex; index++) { // �˻��� ����
																		// index
					if (inputID.equals(idArray[index])) {
						findIndex = index;
						break;
					}
				}
				if (findIndex > -1) {
					System.out.print("�н����� : ");
					inputPWD = scan.nextLine();
					if (inputPWD.equals(pwdArray[findIndex])) {
						System.out.println("�α��ο� �����ϼ˽��ϴ�.\n");
					} else { // �н����� ����ġ
						System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�.");
					}
				} else { // ���������ʴ� ���̵�
					System.out.println("���̵� ��ġ�����ʽ��ϴ�.");
				}
				break;
			case "2":
				System.out.println("ȸ�������� �����ϼ̽��ϴ�.\n");

				System.out.print("���̵� : ");
				inputID = scan.nextLine();

				if (currentIndex >= idArray.length) { // ���̵� �ִ��� Ȯ��
					String[] temp = new String[idArray.length + 20];
					for (int i = 0; i < idArray.length; i++) {
						temp[i] = idArray[i];
					}
					idArray = temp;
				}

				boolean exsistID = false;

				for (int i = 0; i < idArray.length; i++) { // ���̵� �ߺ�Ȯ��
					if (inputID.equals(idArray[i])) {
						exsistID = true;
					}
				}

				if (!exsistID) {
					System.out.print("�н����� : ");
					inputPWD = scan.nextLine();
					idArray[currentIndex] = inputID;
					pwdArray[currentIndex] = inputPWD;
					currentIndex++;
					System.out.println("���Կ� �����߽��ϴ�. ");
				} else {
					System.out.println("�ߺ��� ���̵� �Դϴ�. ");
				}

				break;
			case "3":
				msg = "���̵�/�н����� ã�⸦ �����ϼ̽��ϴ�.";
				break;
			case "4":
				msg = "���α׷��� �����մϴ�..";
				System.out.println(msg);
				return;
			default:
				msg = "�޴� ������ �ùٸ��� �ʽ��ϴ�.";
			}
			System.out.println(msg);
		}
	}

}
