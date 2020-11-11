package com.javaex.ex01;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Ex01 {
	
	public static void main(String[] args) {
		
		int myAge;
		myAge = 25;
		System.out.println(myAge);
		
		myAge = 26;
		System.out.println(myAge);
		
		//정수형
		int var01 = 3;
		double var02 = -3.0;
		
		
//		byte var04 = 12345678;
//		short var05 = 12345678;
		int var03 = 12345678;
		long var06 = 12345678;
		System.out.println(var06);
			
		//long형
//		int var07 = 21456678799; //int 범위보다 큰 값
		
		long var08 = 21456678799L; //long형에 대입이 안됌 >>> -- > L 기호를 붙여야함 
		long var09 = 2147483647;
		
	}

}
