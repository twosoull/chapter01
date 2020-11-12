package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
//		if(num%2==0 && num>0) {
//			System.out.println("짝수입니다.");
//		}else if((num-1)%2==0 && num>0) {
//			System.out.println("홀수입니다.");
//		}else if(0>num) {
//			System.out.println("음수입니다.");
//		}else if(0 == num) {
//			System.out.println("0입니다.");
//		}
//		sc.close();
		
		if(num >0) {
			if(num%2 == 0) {
				System.out.println("짝수입니다");
			}else {
				System.out.println("홀수입니다");
			}
		}else if(0>num){
			System.out.println("음수입니다");
		}else {
			System.out.println("0입니다");
		}
		sc.close();
	}
}
