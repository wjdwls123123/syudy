package com.Test.Quiz;

import java.util.Random;
import java.util.Scanner;

public class UpDown {

	public static void main(String[] args) {
		System.out.println("* Up Down *");
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		
		Random rn = new Random();
		int answer = rn.nextInt(101);
		int count, a, b;
		a = 0; b = 100;
		int c = -1;
		
		while(c != answer){
			System.out.println("���� �Է� >> ");
			c = scanner.nextInt();
			
			if (c > b || c < a){
				System.out.println("100������ ���ڸ� ���");
				System.out.println();
			} else if(c == answer) {
				System.out.println("You Win!!");
				System.out.println();
			} else if(c <= answer) {
				System.out.println("Up!");
				System.out.println();
			} else if(c >= answer) {
				System.out.println("Down!");
				System.out.println();
			
		}
			
	  }
   }
}
