package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("과목코드를 입력하세요");
			System.out.println("과목코드 : ");
			String code = sc.nextLine();
			
			switch(code) {
				case "A":
					System.out.println("R101호");
					break;
				case "B":
					System.out.println("R202호");
					break;
				case "C":
					System.out.println("R303호");
					break;
				case "D":
					System.out.println("R404호");
					break;
				default:
					System.out.println("상담원 문의");
					break;
			}
		}
}
