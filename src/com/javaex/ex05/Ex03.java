package com.javaex.ex05;

public class Ex03 {
	public static void main(String[] args) {
		
	
	int[] lottos = new int[6];
	
	for(int i=0; i<6; i++) {
		lottos[i] = (int)(Math.random()*45)+1;
		System.out.println(lottos[i]);
	}
}
}