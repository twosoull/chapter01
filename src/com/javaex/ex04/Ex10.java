package com.javaex.ex04;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		while(true) {
			
		int num = sc.nextInt();
		
			if(num==0) {
			System.out.println("종료합니다");
			break;
			}else if(num%3==0) {
			System.out.println("3의배수입니다");
			
			}else {
			System.out.println("3의배수가아닙니다");
			
			}
			sc.close();
		}
}
}