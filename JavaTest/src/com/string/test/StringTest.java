package com.string.test;

public class StringTest {

	public static void main(String[] args) {

		// String ���ڰ������� �𿩼� ������� Ŭ���� (Ÿ�� - �迭)

		String msg = "�ݰ����ϴ�."; // string ���� �Ἥ ����(msg)������ �ʱ�ȭ

		// string Ŭ������ �޼��� ����
		System.out.println(msg); // ������ ���
		System.out.println("���ڿ����� :" + msg.length()); // length : �޸� ���� ���
		System.out.println("���ڿ� �� :" + msg.equals("�ٹٹ�")); // equals : �ϳ���
															// ���ڿ��̶� Ʋ����
															// false!!
		System.out.println("����Ž�� :" + msg.contains("�ݰ�")); // contains : �ϳ���
															// ���ڿ��̶� ������ frue
		System.out.println("�� �ε��� ��ȯ :" + msg.indexOf("�ϴ�"));
		// indexOf "�ݰ����ϴ�"�� ���ڼ������� �ϴٱ����� ������ �ձ��� �ϱ������� ������������ 0,1,2,3�� 3���� ���
		System.out.println("index�� ���� ��ȯ :" + msg.charAt(2)); // charAt : ������
																// ������ ���ڿ� ù�κ���
																// 0�� �������� 2��°��
																// ���� ���
		System.out.println("���ڿ� Ȯ�� :" + msg.isEmpty()); // isEm0pty :
		System.out.println("���ڿ� ��ü :" + msg.replace("�ݰ���", "������"));
		System.out.println("���ڿ� �߶󳻱� :" + msg.substring(0, 3)); // index 0~3�� ����
																// msg�� ��Ÿ��
		System.out.println("�빮�� ��ȯ :" + msg.toUpperCase());
		System.out.println("�ҹ��� ��ȯ :" + msg.toLowerCase()); // �޼��� �տ� to �� ������
															// ~~�� ��ȯ�Ѵٴ� ��

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
		System.out.println(isNumber ? "����" : "���ڰ� �ƴ�");

	}

}
