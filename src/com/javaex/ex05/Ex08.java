package com.javaex.ex05;

public class Ex08 {

		public static void main(String[] args) {
			
			int[] leftArray = new int[] {10,20,30};
			int[] rightArray = new int[] {10,20,30};
			
			if(leftArray.length == rightArray.length) {
				for(int i = 0 ; i<rightArray.length; i++) {
					 if(leftArray[i] != rightArray[i]) {
						System.out.printf("%d 번째 값이 다릅니다.",i);
				}
				}
			}else {
				System.out.println("두배열의 크기가 다릅니다");
			}
		
			
			
		}
}
