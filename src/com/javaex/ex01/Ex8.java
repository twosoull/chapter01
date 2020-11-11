package com.javaex.ex01;

public class Ex8 {

	
		public static void main(String[] args) {
			
			//대입연산자
			int a =7;
			int b =2;
			
			//산술연산자
			System.out.println("산술연산자");
			
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(b-a);
			System.out.println(a*b);
			System.out.println(a/b);
			System.out.println(a%b);
			
			
					
			System.out.println(7.0/2.0); //정수형 나누기와 비교
			System.out.println(7.0%2.0);
			
			//부호연산자
			int var01 = -3;
			System.out.println(var01);
			System.out.println(-var01);
			System.out.println(+var01);
			System.out.println("=========");
			
			
			////
			//증감연산자
			System.out.println(a);
			System.out.println(++a); //신제 변수 a값이 변경된다. 7--->8 출력
			System.out.println(a);
			
			System.out.println(b);
			System.out.println(--b); // 2 -- > 1출력
			System.out.println(b);
			System.out.println("=========");
			
			System.out.println(a); //8
			System.out.println(a++); //8
			System.out.println(a); //9
			
			System.out.println(b); //1
			System.out.println(b--); //0
			System.out.println(b); //0
			
			++b;
			System.out.println(b); //1
			b++;
			System.out.println(b); //1
			
			
		}
		
}