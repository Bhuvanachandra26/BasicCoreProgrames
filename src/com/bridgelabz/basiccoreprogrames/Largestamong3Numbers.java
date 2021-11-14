package com.bridgelabz.basiccoreprogrames;

import java.util.Scanner;
public class Largestamong3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println(" enter number 1:  ");
		int a = s.nextInt();
		System.out.println(" enter number 2:  ");
		int b = s.nextInt();
		System.out.println(" enter number 3:  ");
		int c = s.nextInt();
		
		if(a>b && a>c)
			System.out.println( a +" : is greater ");
		else if (b>a && b>c)
			System.out.println(b+" :is greater ");
		else
			System.out.println( c +" : is greater ");


	}

}


