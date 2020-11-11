package com.javaex.ex02;

public class Ex01 {
	
		public static void main(String[] args) {
			
			int i =2345;
			double d= 3.14;
			String str = "굿모닝";
			
			System.out.println(str + " 랑 " + i);
			
			//char
			char c ='한' ;
			String s = "한";
			System.out.println(c);
			System.out.println(c+c);
			System.out.println(c+s);
			
			// 제 이름은 황일영 입니다.
			String name = "이영훈";
			System.out.println(name);// 메모리 공간의 이름
			System.out.println("name"); // name 문자열
			System.out.println("제 이름은 "+ name +" 입니다.");
			
			System.out.println("안녕\"하\"세요");
			System.out.println("안녕\\하\\세요");
			System.out.println("안녕\t하세요");
			System.out.println("안녕\n하\n세요");
			
			
		}
}
