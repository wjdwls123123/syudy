package com.test.exercise;

public class EX04_13 {

	public static void main(String[] args) {

		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		// charAt(int i) �ݺ����� �� �̿��ؼ� ���ڿ��� ���ڸ�
		// �ϳ��� �о �˻��Ѵ�
		for (int i = 0; i < value.length(); i++) {
			ch = value.charAt(i);
			if (ch >= '0' && ch <= '9') {
				isNumber = false;
				break;
			}
		}
		if (isNumber) {
			System.out.println(value + "�� �����Դϴ�.");
		} else {
			System.out.println(value + "�� ���ڰ� �ƴմϴ�.");
		}
	} 
		
} 