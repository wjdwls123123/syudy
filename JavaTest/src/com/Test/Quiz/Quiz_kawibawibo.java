package com.Test.Quiz;

import java.util.Scanner;

public class Quiz_kawibawibo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] kawebawebo = { "����", "����", "��" };
		int kawebaweboNum = 0;
		String menu = null;
		while (true) {
			int comKawebawebo = (int) (Math.random() * 3);

			System.out.println("[1]����");
			System.out.println("[2]����");
			System.out.println("[3]��");			
			System.out.print("�����ϼ���. ����[Q] : ");

			menu = scan.nextLine();
			switch (menu.toLowerCase()) {
			case "1":
			case "2":
			case "3":
				kawebaweboNum = Integer.parseInt(menu) - 1;
				break;
			case "q":
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("��Ȯ�ϰ� �����Ͻñ� �ٶ��ϴ�.");
				continue;
			}
			System.out.println("����� : " + kawebawebo[kawebaweboNum]);
			System.out.println("��ǻ�� : " + kawebawebo[comKawebawebo]);
			if ((kawebaweboNum + 1) % 3 == comKawebawebo) {
				System.out.println("���׿�...");
			} else if (kawebaweboNum == comKawebawebo) {
				System.out.println("�����...");
			}else{
				System.out.println("�̱�̳׿�..�����մϴ�....");
			}
			System.out.println("\n");
		}

	}
}
