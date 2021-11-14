package com.bridgelabz.basiccoreprogrames;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println(" enter the value of N : ");
		int n = s.nextInt();
		float h = 1;
		for (int i=2; i<=n;i++) {
			h= h+1f/i;
		}
		System.out.println(h);

	}

}