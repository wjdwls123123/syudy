package com.test.exercise;

import javax.print.DocFlavor.STRING;

public class EX04_1 {

	public static void main(String[] args) {
		//
		// 4-1 1.
		int x = 11; // ���� x �� 11 �ʱ�ȭ
		System.out.println(x > 10 && x < 20); // %%(and) �������� ����Ͽ� �񱳰��� ���
		// 4-1 2. 
		char ch = '5'; // ch�� ��������ó�� ���� �ʱ�ȭ
		System.out.println(!(ch == ' ' || ch == '\t')); // ch�� ' ' ���ų� || ch��'\t'�� ���� ( || (or)���ʸ� true���� true (�տ� !������ �������� true ���� �����ϴϱ� false�� ����
		// 4-1 3.
		System.out.println(ch == 'x' || ch == 'X'); // ch�� x�� ���ų� ch�� x�� ������ true ���� ���
		// 4-1 4. 
		System.out.println(ch >= '0' && ch <= '9'); // ch�� o���� ū�����̰ų� 9���� ������ ���߿� �ϳ��� true�� true
		// 4-1 5. 
		System.out.println((ch >= 'a' && ch <= 'Z') || (ch >= 'A' && ch <= 'X')); //a ~ Z ������ ���ҹ����� ���� , A ~ X ������ �빮���� ����
		// 4-1 6. 
		int year = 2000; // ������ 2000 �ʱ�ȭ
		System.out.println(((year % 400) == 0) || ((year % 4) == 0 && (year % 100) != 0));
		// ������ 400�� ���� ���������� 0�� ���ų� ������ 4�� ���� ���� 0�� ������ ���߿� �ϳ��� true�̰ų� 100���� ���������� 0�� ������ 0�ΰ��� ��� ���� ! ���� ������
		// 4-1 7.
		boolean powerOn = false; //���� powerOn �� false �ʱ�ȭ
		System.out.println(!powerOn); //powerOn �� ������ ���簪�� false ���� �����Ǽ� true ���
		// 4-1 8.
		String str = "yes"; // ���� str�� yes �ʱ�ȭ
		System.out.println(str.equals("yes")); 	// str�� �Էµ� "yes"�� equals ���ؼ� ������ true Ʋ���� false

	}

}
