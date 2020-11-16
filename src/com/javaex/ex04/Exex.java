package com.javaex.ex04;

import java.util.Scanner;

	public class Exex {
		public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int A = sc.nextInt();
		
		for(int i =1; i<=A; i++) {
			for(int j = A; j>i; j--) {
				System.out.print(" ");
				}
			for(int k = 0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
}//메소드 종료
}//클래스 종료