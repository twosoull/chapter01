package com.javaex.ex04;

import java.util.Scanner;

public class exo1 {

	
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			int N = sc.nextInt();
			
			for(int i=0; i<N; i++) {
				for(int k=N; k>=i+2; k--) {
					System.out.print(" ");
				}
				for(int j = 0; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
}
