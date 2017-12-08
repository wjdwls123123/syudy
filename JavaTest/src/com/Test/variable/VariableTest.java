package com.Test.variable;

import java.util.Scanner;

public class VariableTest {

	public static void main(String[] args) {

		// Quiz 1)
		// 1234.56789 의 수에 소수점 세째자리에서 반올림하시오.
		// hint)
		// System.out.println((int) 1.452654);

		float x = 1234.56789f; // 소수점을 반올림하기 위해 float 로 변수 x를 선언하고 실수 초기화
		x = (x + 0.005f); // 실수 x에 0.005를 덧셈하여 Quiz의 값인 1234.57???을 일단 만듬 덧셈을
							// 하기위해 0.005도 float 사용
		x = (int) (x * 100); // 123457까지의 값만 남기고 불필요한 값을 제거하기위해 100을 곱하고 정수형으로
								// 변환
		x = x / 100f; // 소수점을 넣기위해 100을 나눗셈해주는데 정수인 x를 실수로 변환하기위해 100뒤에 float 로
						// 실수변환
		System.out.println("정답 :" + x); // x 출력

		Scanner scan = new Scanner(System.in); // 콘솔에서 들어온다 (in) 나간다(out) //
												// ctrl + shilt + O (적용) 대소문자
												// 구분함

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
			
			while(!isNumber){
				int score=0;
				String msg="";
				
				System.out.print("국어점수 : ");		// print 문을 써줌으로 실행후 옆에 붙음 에) println 문을 사용하면 밑으로 떨어짐
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
						if(!(score>=0 && score<+100)){
							isNumber=false;
							msg="0~100사이의 점수를 입력하세요..";
						}
						
					}
					
					if(!msg.isEmpty()) System.out.println(msg);
					}
			
			kor = Integer.parseInt(scan.nextLine()); // 문자형인 scan을 바꾸기 위해 Integer.parseInt 넣고 정수형으로 바꿈
			System.out.print("영어점수 : ");
			eng = Integer.parseInt(scan.nextLine());
			System.out.print("수학점수 : ");
			math = Integer.parseInt(scan.nextLine());

			int total = kor + eng + math; // 총점을 구하기위해 변수 total 에 kor, eng, math
											// 각각
											// 덧셈으로 초기화

			float avg = total / 3; // 평균을 구하기위해 소수점이 가능한 float 를 넣고 avg 변수
									// total와 3을
									// 나눗셈으로 초기화

			System.out.println("총점 : " + total); // total에 선언된 변수 출력
			System.out.println("평균 : " + avg); // avg에 선언된 변수 출력
			System.out.println("평균 : " + ((avg >= 90) ? "A" : (avg >= 80) ? "B" : "F"));
			// 변수 avg에 지정해둔 값을 기준으로 삼항연산자의 true 와 false 를 이용하여 각각 true면 A를 그대로
			// 출력하고
			// false 일 경우 다시 삼항연산자를 이용하여 B와 F를 상황에 맞게 출력할수있게 함

			// Quiz 2)
			// 평균이 90이상 : A
			// 평균이 80이상 : B
			// 평균이 80미만 : F
			// 를 출력하시오.

			// 정답예제
			char grade = (avg >= 90) ? 'A' : ((avg >= 80) ? 'B' : 'F');
			// char 문자형을 써서 avg의 구해진 평균값을 90에 삼항연산자 >=를 쓴뒤 ? 'A':'B'로 조건식을
//																		 걸고
//																		 frue
//																		 와
//																		 false를
//																		 정한뒤
//																		 frue
//																		 일겨우
//																		 출력
//																		 false
//																		 일경우
//																		 다시 식을
//																		 주어
//																		 Quiz2에
//																		 문제처럼
//																		 A,B,F
//																		 를 나타냄
			System.out.println("학점 : " + grade); // grade 값 출력

			String gradeIf = ""; // String 문자열에 gradeIf 변수를 선언하고 "" 줌으로써 코드를 짜는
									// 사이사이에 원하는 값을 출력할수있게 함
			if (avg >= 90) { // 평균값을 구하기위해 조건 반복문인 if 사용하여 avg의 평균값과 삼항연산자 대조
				gradeIf = "A"; // String 문자열로 인해 gradeIf 값을 "A"로 설정해주고 위에 값이
								// true 일경우 출력하고 다음행으로 가고 false 면 if문을 벗어나서 else
								// if 문부터 행 시작됨
				if (avg >= 95) { // avg의 평균값과 삼항연산자 대조
					gradeIf = gradeIf + "+"; // (avg >= 95) 값이 true 일경우 넘어와서 문자열
												// "+" 추가해줘 "A" 와 "+"의 문자열이 합쳐져
												// "A+"가 출력 false 면 "A"하나만 출력
												// *문자열은 수정되지않고 그대로 붙여서 나옴
				}
			} else if (avg >= 80) { // else if문을 써서 if의 문이 false 나올경우 바로 else if
									// 문 실행되도록 함
				gradeIf = "B"; // true = B 출력 false = 다음 else 지점으로 이동
				if (avg >= 85) { // 삼항연산자 사용
					gradeIf = gradeIf + "+"; // true = B+ 출력 false = B 출력
				}
			} else { // 아무것도 해당이 없을때 else 문에 저장된 문자열 출력
				gradeIf = "F"; // F 출력
			}

			System.out.println("학점 : " + gradeIf); // 출력
			System.out.println();
			System.out.print("계속하시겠습니까? (y/n)");
			answer=scan.nextLine().toLowerCase();
		}

	}

}
