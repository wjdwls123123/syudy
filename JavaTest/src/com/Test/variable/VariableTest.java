package com.Test.variable;

import java.util.Scanner;

public class VariableTest {

	public static void main(String[] args) {

		// Quiz 1)
		// 1234.56789 �� ���� �Ҽ��� ��°�ڸ����� �ݿø��Ͻÿ�.
		// hint)
		// System.out.println((int) 1.452654);

		float x = 1234.56789f; // �Ҽ����� �ݿø��ϱ� ���� float �� ���� x�� �����ϰ� �Ǽ� �ʱ�ȭ
		x = (x + 0.005f); // �Ǽ� x�� 0.005�� �����Ͽ� Quiz�� ���� 1234.57???�� �ϴ� ���� ������
							// �ϱ����� 0.005�� float ���
		x = (int) (x * 100); // 123457������ ���� ����� ���ʿ��� ���� �����ϱ����� 100�� ���ϰ� ����������
								// ��ȯ
		x = x / 100f; // �Ҽ����� �ֱ����� 100�� ���������ִµ� ������ x�� �Ǽ��� ��ȯ�ϱ����� 100�ڿ� float ��
						// �Ǽ���ȯ
		System.out.println("���� :" + x); // x ���

		Scanner scan = new Scanner(System.in); // �ֿܼ��� ���´� (in) ������(out) //
												// ctrl + shilt + O (����) ��ҹ���
												// ������

		int kor;
		int eng;
		int math;

		String answer = "";
		
		// Quiz 3)
		// �ԷµǴ� ���� 0~100������ ������ ����;
		// '����Ͻðڽ��ϱ�?(y/n)' �޼����� ����ϰ�
		// 'n' �϶����� �ݺ�.
		String scoreStr="";
		boolean isNumber = false;
		
		while (!answer.equals("n")) {
			
			while(!isNumber){
				int score=0;
				String msg="";
				
				System.out.print("�������� : ");		// print ���� �������� ������ ���� ���� ��) println ���� ����ϸ� ������ ������
				scoreStr=scan.nextLine();
				
				//������ �Ǵ�
				char checkChar=' ';
				for(int i=0;i<scoreStr.length();i++){
					checkChar=scoreStr.charAt(i);
					if(checkChar>='0' && checkChar<='9'){
						isNumber=true;
					}else{
						isNumber=false;
						msg="�Է°��� �ùٸ��� �ʽ��ϴ�.";
						break;
					
					}
					
				}
					//0~100 ����
					if(isNumber){
						score=Integer.parseInt(scoreStr);
						if(!(score>=0 && score<+100)){
							isNumber=false;
							msg="0~100������ ������ �Է��ϼ���..";
						}
						
					}
					
					if(!msg.isEmpty()) System.out.println(msg);
					}
			
			kor = Integer.parseInt(scan.nextLine()); // �������� scan�� �ٲٱ� ���� Integer.parseInt �ְ� ���������� �ٲ�
			System.out.print("�������� : ");
			eng = Integer.parseInt(scan.nextLine());
			System.out.print("�������� : ");
			math = Integer.parseInt(scan.nextLine());

			int total = kor + eng + math; // ������ ���ϱ����� ���� total �� kor, eng, math
											// ����
											// �������� �ʱ�ȭ

			float avg = total / 3; // ����� ���ϱ����� �Ҽ����� ������ float �� �ְ� avg ����
									// total�� 3��
									// ���������� �ʱ�ȭ

			System.out.println("���� : " + total); // total�� ����� ���� ���
			System.out.println("��� : " + avg); // avg�� ����� ���� ���
			System.out.println("��� : " + ((avg >= 90) ? "A" : (avg >= 80) ? "B" : "F"));
			// ���� avg�� �����ص� ���� �������� ���׿������� true �� false �� �̿��Ͽ� ���� true�� A�� �״��
			// ����ϰ�
			// false �� ��� �ٽ� ���׿����ڸ� �̿��Ͽ� B�� F�� ��Ȳ�� �°� ����Ҽ��ְ� ��

			// Quiz 2)
			// ����� 90�̻� : A
			// ����� 80�̻� : B
			// ����� 80�̸� : F
			// �� ����Ͻÿ�.

			// ���俹��
			char grade = (avg >= 90) ? 'A' : ((avg >= 80) ? 'B' : 'F');
			// char �������� �Ἥ avg�� ������ ��հ��� 90�� ���׿����� >=�� ���� ? 'A':'B'�� ���ǽ���
//																		 �ɰ�
//																		 frue
//																		 ��
//																		 false��
//																		 ���ѵ�
//																		 frue
//																		 �ϰܿ�
//																		 ���
//																		 false
//																		 �ϰ��
//																		 �ٽ� ����
//																		 �־�
//																		 Quiz2��
//																		 ����ó��
//																		 A,B,F
//																		 �� ��Ÿ��
			System.out.println("���� : " + grade); // grade �� ���

			String gradeIf = ""; // String ���ڿ��� gradeIf ������ �����ϰ� "" �����ν� �ڵ带 ¥��
									// ���̻��̿� ���ϴ� ���� ����Ҽ��ְ� ��
			if (avg >= 90) { // ��հ��� ���ϱ����� ���� �ݺ����� if ����Ͽ� avg�� ��հ��� ���׿����� ����
				gradeIf = "A"; // String ���ڿ��� ���� gradeIf ���� "A"�� �������ְ� ���� ����
								// true �ϰ�� ����ϰ� ���������� ���� false �� if���� ����� else
								// if ������ �� ���۵�
				if (avg >= 95) { // avg�� ��հ��� ���׿����� ����
					gradeIf = gradeIf + "+"; // (avg >= 95) ���� true �ϰ�� �Ѿ�ͼ� ���ڿ�
												// "+" �߰����� "A" �� "+"�� ���ڿ��� ������
												// "A+"�� ��� false �� "A"�ϳ��� ���
												// *���ڿ��� ���������ʰ� �״�� �ٿ��� ����
				}
			} else if (avg >= 80) { // else if���� �Ἥ if�� ���� false ���ð�� �ٷ� else if
									// �� ����ǵ��� ��
				gradeIf = "B"; // true = B ��� false = ���� else �������� �̵�
				if (avg >= 85) { // ���׿����� ���
					gradeIf = gradeIf + "+"; // true = B+ ��� false = B ���
				}
			} else { // �ƹ��͵� �ش��� ������ else ���� ����� ���ڿ� ���
				gradeIf = "F"; // F ���
			}

			System.out.println("���� : " + gradeIf); // ���
			System.out.println();
			System.out.print("����Ͻðڽ��ϱ�? (y/n)");
			answer=scan.nextLine().toLowerCase();
		}

	}

}
