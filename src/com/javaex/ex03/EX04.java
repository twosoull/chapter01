package com.javaex.ex03;

import java.util.Scanner;

public class EX04 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("근무시간:");
//		int hour = sc.nextInt();
//		int money = 0;
//		int up = hour - 8;
//		if(up<=0) {
//			money = 10000*hour;  
//		}else if(up>0) {
//			money = (10000*hour)+(2000*up);
//			
//		}
//		System.out.println("임금은 "+ money +" 입니다.");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간:");
		int hour = sc.nextInt();
		int money = 0;
		int up = hour - 8;
		if(up<=0) {
			money = 10000*hour;  
		}else if(up>0) {
			money = 10000*hour + (int)((10000*1.5)-10000)*up;
			
		}
		System.out.println("임금은 "+ money +" 입니다.");
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("근무시간 :");
//		int time = sc.nextInt();
//		int pay = 0;
//		int unit = 10000;
//		if(time>8) {
//			pay= (unit*8)+(time-8)*(int)(unit*1.5);
//		}else {
//			 pay = unit*time;
//		}
//		sc.close();
//		System.out.println("임금은 "+pay+"원 입니다");
		
	}
}
