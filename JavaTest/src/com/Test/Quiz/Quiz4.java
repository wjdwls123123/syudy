package com.Test.Quiz;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] idArray = new String[100];	// �迭 �����ϰ� 100�� ��
		idArray[0] = "mimi";
		idArray[1] = "mama";
		idArray[2] = "mumu";
		String[] pweArray = new String[100]; // �迭 �����ϰ� 100�� ��
		pweArray[0] = "mimi";
		pweArray[1] = "mama";
		pweArray[2] = "mumu";

		String id = " ";
		String pw = " ";

		int i = 3;

		while (true) { // �׻� ���ϼ��ְ� true ������ ��

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
				msg = "�α����� �����ϼ̽��ϴ�.";
				System.out.println("���̵� �Է� : ");
				id = scan.nextLine();	// id ���ڿ� �Է�
				System.out.println("�н����� �Է� : ");
				pw = scan.nextLine();	// pw ���ڿ� �Է�
				for (int num = 0; num < i; num++) {		// num ���� 0�̰� i���� Ŭ������ �������Ѵ�
					if (id.equals(idArray[num])) {		// id�� equals �� �Ͽ� �Է������� �迭 �ӿ��ִ� num���̶� ��
						if (pw.equals(pweArray[num])) {	// pw�� equals �� �Ͽ� �Է������� �迭 �ӿ��ִ� num���̶� ��
							System.out.println("�α����� �����ϼ˽��ϴ�.");	// ���ڿ� ���
							break;
						} else {
							System.out.println("�α����� �����ϼ˽��ϴ�.");	// ���ڿ� ���
							break;
						} 
					}else if (num == i){
						System.out.println("�α����� �����ϼ˽��ϴ�.");
						break;
					}
					
				}
			

				break;
			case "2":
				msg = "ȸ�������� �����ϼ̽��ϴ�.";
				System.out.println("���̵� : "); 
				idArray[i] = scan.nextLine();	// idArray �迭�� i���� ���������� ������Ŵ
				System.out.println("�н����� : ");
				pweArray[i] = scan.nextLine();	// pweArray �迭�� i���� ���������� ������Ŵ
				System.out.println("ȸ�������� �����ϼ˽��ϴ�.");
				System.out.println();
				i++;	// i�� ������
				break;
			case "3":
				msg = "���̵�/�н����� ã�⸦ �����ϼ̽��ϴ�.";
				break;
			case "4": 
				msg = "���α׷��� �����մϴ�..";
				System.out.println(msg);
				return; // �ݺ����� ��� �����Ű�� ����
			default:
				msg = "�޴� ������ �ùٸ��� �ʽ��ϴ�.";
			} // switch�� ����

		} // while�� ����
	}

}
