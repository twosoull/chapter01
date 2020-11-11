package com.javaex.ex01;

	public class Ex10 {

		public static void main(String[] args) {
			
			//논리연산자
			
			//&&
			
			System.out.println("&&연산자");
			
			System.out.println(true&&true); //==true
			System.out.println(true&&false); //==false
			System.out.println(false&&true); //==false
			System.out.println(false&&false); //==false
			
			//||
			System.out.println("||연산자");
			System.out.println( true || true); // T || T true 	
			System.out.println( true || false);// T || T true
			System.out.println( false || true); //	F||T true
			System.out.println( false || false); //	F||F false
			
			//응용
			int a = 5;
			int b = 7;
			System.out.println("응용");
			System.out.println((a>b)&&(a<b)); // 5>7--T && 5<7--F  F&&T = F
			System.out.println((a>b)&&(a>b)); // 5>7--F && 5>7--F  T&&T = F			
			System.out.println((a>b)||(a<b)); // 5>7--F && 5<7 --T F||T = T
			
			System.out.println("! 연산자");
			System.out.println((a>b));; //5>7--> F
			System.out.println(!(a>b));; //!(5>7)--> !F ---> T
			
			System.out.println(a>b&&a<b); //5>7 && 5<7 -->F
			
			System.out.println(!(a<b)); // !T-->f
			
		}
}
