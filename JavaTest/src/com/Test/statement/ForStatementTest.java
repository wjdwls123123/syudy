package com.Test.statement;

import java.util.Scanner;

public class ForStatementTest {

	public static void main(String[] args) {
		
		//�ݺ���
		int sum=0;				// sum ������ 0 �ʱ�ȭ
		int sumPlus=0;			// sumPlus ������ 0 �ʱ�ȭ
		for(int i=1;i<11;i++){	// for �ݺ��� ����Ͽ� ������ int �� ���� i�� 1�� �ʱ�ȭ, i<11 ����Ͽ� �������� ����Ұ��� ��������(���ǽ�),i++�� ��������(������)
			
			sumPlus+=sum;		//  
		}
		System.out.println(sum);
		// 1  +  (1+2) + (1+2+3)+......+(1+2+3+4+5+6+7+8+9+10)
		// sum +  sum  +   sum	 ........ sum
		
		//while �ݺ���
		Scanner scan=new Scanner(System.in);   // Scanner ���� ȭ�鿡�� �Է��� ������ �� ���� scan�� �������ְ� new Scanner �� Scanner�̶� Ŭ������ ��ü�� ����
											   // System �� in���� ���������Ҽ��ֵ����� out�̸� ���� (���۾ȵ�) 
		while(!scan.nextLine().equals("y")){   // while�ݺ����� �������� nextLine() �����࿡ equals("y") "" �ȿ� �� ������ ������ scan �ϴµ� ! ������������ ������ ����� 
				System.out.println("y�� ������ ������ �ݺ��մϴ�.");	// ���
		}
	
	}

}
