package com.Test.statement;

import java.util.Scanner;

public class ForStatementTest {

	public static void main(String[] args) {
		
		//반복문
		int sum=0;				// sum 변수에 0 초기화
		int sumPlus=0;			// sumPlus 변수에 0 초기화
		for(int i=1;i<11;i++){	// for 반복문 사용하여 정수형 int 에 변수 i에 1을 초기화, i<11 사용하여 언제까지 출력할건지 조건지정(조건식),i++로 증감지정(증감식)
			
			sumPlus+=sum;		//  
		}
		System.out.println(sum);
		// 1  +  (1+2) + (1+2+3)+......+(1+2+3+4+5+6+7+8+9+10)
		// sum +  sum  +   sum	 ........ sum
		
		//while 반복문
		Scanner scan=new Scanner(System.in);   // Scanner 문은 화면에서 입력을 받을때 씀 변수 scan을 지정해주고 new Scanner 로 Scanner이란 클래스에 객체를 생성
											   // System 에 in으로 직접조작할수있도록함 out이면 나감 (조작안됨) 
		while(!scan.nextLine().equals("y")){   // while반복문을 기준으로 nextLine() 다음행에 equals("y") "" 안에 들어간 같은걸 누르면 scan 하는데 ! 부정이있으니 눌르면 멈춰라 
				System.out.println("y를 누르기 전까지 반복합니다.");	// 출력
		}
	
	}

}
