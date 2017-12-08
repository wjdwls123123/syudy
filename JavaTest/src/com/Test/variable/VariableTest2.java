package com.Test.variable;

import java.util.Scanner;

public class VariableTest2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

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
			
			int score=0;
			while(!isNumber){
				score=0;
				String msg="";
				
				System.out.print("�������� : ");
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
					if(!(score>=0 && score<=100)){
						isNumber=false;
						msg="0~100 ������ ������ �Է��ϼ���..";
					}
				}
				
				if(!msg.isEmpty()) System.out.println(msg);
			
			}
			kor=score;
			
			isNumber=false;
			eng=0;
			while(!isNumber){
				score=0;
				String msg="";
				
				System.out.print("�������� : ");
				try{
					score=Integer.parseInt(scan.nextLine());
					if(score>=0 && score<=100){
						eng=score;
						isNumber=true;
					}else{
						msg="0~100 ������ ������ �Է��ϼ���.";
					}
				}catch(NumberFormatException e){
					msg="�Է°��� �ùٸ��� �ʽ��ϴ�.";					
				}
				
				
				if(!msg.isEmpty()) System.out.println(msg);
			
			}
			
			isNumber=false;
			math=0;
			while(!isNumber){
				score=0;
				String msg="";
				
				System.out.print("�������� : ");
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
					if(!(score>=0 && score<=100)){
						isNumber=false;
						msg="0~100 ������ ������ �Է��ϼ���..";
					}
				}
				
				if(!msg.isEmpty()) System.out.println(msg);
			
			}
			math=score;

			int total = kor + eng + math;

			float avg = total / 3;

			System.out.println("���� : " + total);
			System.out.println("��� : " + avg);

			// Quiz 2)
			// ����� 90�̻� : A
			// ����� 80�̻� : B
			// ����� 80�̸� : F
			// �� ����Ͻÿ�.

			char grade = (avg >= 90) ? 'A' : ((avg >= 80) ? 'B' : 'F');
			System.out.println("���� : " + grade);

			String gradeIf = "";
			if (avg >= 90) {
				gradeIf = "A";
				if (avg >= 95) {
					gradeIf = gradeIf + "+";
				}
			} else if (avg >= 80) {
				gradeIf = "B";
				if (avg >= 85) {
					gradeIf = gradeIf + "+";
				}
			} else {
				gradeIf = "F";
			}

			System.out.println("���� : " + gradeIf);
			System.out.println();
			System.out.print("����Ͻðڽ��ϱ�?(y/n)");
			answer=scan.nextLine().toLowerCase();
		}
	}

}
