package com.javaex.ex05;

public class Ex07 {

		public static void main(String[] args) {
			
			int[] arrA = new int[3];
			arrA[0] = 3;
			arrA[1] = 6;
			arrA[2] = 9;
			
			int[] arrB;//변수만 생성
			
			arrB = arrA;//주소 값만 복사됌 같은 데이터를 바라봄
						//실제 데이터가 복사되는것이 아니다
			
			for(int i=0; i<arrA.length; i++) {
				System.out.println(arrA[i]);
			}
			
			for(int i=0; i<arrB.length; i++) {
				System.out.println(arrB[i]);
			}
			System.out.println("================");
			arrA[1]=100;
			
			for(int i=0; i<arrA.length; i++) {
				System.out.println(arrA[i]);
			}
			
			for(int i=0; i<arrB.length; i++) {
				System.out.println(arrB[i]);
			}
		}
}
