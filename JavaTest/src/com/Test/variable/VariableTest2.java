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
		// 입력되는 값은 0~100사이의 정수만 가능;
		// '계속하시겠습니까?(y/n)' 메세지를 출력하고
		// 'n' 일때까지 반복.
		String scoreStr="";
		boolean isNumber = false;
		
		while (!answer.equals("n")) {
			
			int score=0;
			while(!isNumber){
				score=0;
				String msg="";
				
				System.out.print("국어점수 : ");
				scoreStr=scan.nextLine();
				
				//숫자형 판단
				char checkChar=' ';
				for(int i=0;i<scoreStr.length();i++){
					checkChar=scoreStr.charAt(i);
					if(checkChar>='0' && checkChar<='9'){
						isNumber=true;
					}else{
						isNumber=false;
						msg="입력값이 올바르지 않습니다.";
						break;
					}
				}
				
				//0~100 숫자
				if(isNumber){
					score=Integer.parseInt(scoreStr);
					if(!(score>=0 && score<=100)){
						isNumber=false;
						msg="0~100 사이의 점수를 입력하세요..";
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
				
				System.out.print("영어점수 : ");
				try{
					score=Integer.parseInt(scan.nextLine());
					if(score>=0 && score<=100){
						eng=score;
						isNumber=true;
					}else{
						msg="0~100 사이의 점수를 입력하세요.";
					}
				}catch(NumberFormatException e){
					msg="입력값이 올바르지 않습니다.";					
				}
				
				
				if(!msg.isEmpty()) System.out.println(msg);
			
			}
			
			isNumber=false;
			math=0;
			while(!isNumber){
				score=0;
				String msg="";
				
				System.out.print("수학점수 : ");
				scoreStr=scan.nextLine();
				
				//숫자형 판단
				char checkChar=' ';
				for(int i=0;i<scoreStr.length();i++){
					checkChar=scoreStr.charAt(i);
					if(checkChar>='0' && checkChar<='9'){
						isNumber=true;
					}else{
						isNumber=false;
						msg="입력값이 올바르지 않습니다.";
						break;
					}
				}
				
				//0~100 숫자
				if(isNumber){
					score=Integer.parseInt(scoreStr);
					if(!(score>=0 && score<=100)){
						isNumber=false;
						msg="0~100 사이의 점수를 입력하세요..";
					}
				}
				
				if(!msg.isEmpty()) System.out.println(msg);
			
			}
			math=score;

			int total = kor + eng + math;

			float avg = total / 3;

			System.out.println("총점 : " + total);
			System.out.println("평균 : " + avg);

			// Quiz 2)
			// 평균이 90이상 : A
			// 평균이 80이상 : B
			// 평균이 80미만 : F
			// 를 출력하시오.

			char grade = (avg >= 90) ? 'A' : ((avg >= 80) ? 'B' : 'F');
			System.out.println("학점 : " + grade);

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

			System.out.println("학점 : " + gradeIf);
			System.out.println();
			System.out.print("계속하시겠습니까?(y/n)");
			answer=scan.nextLine().toLowerCase();
		}
	}

}
