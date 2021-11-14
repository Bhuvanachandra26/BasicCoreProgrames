package com.bridgelabz.basiccoreprogrames;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println(" enter a year ");

		int year = s.nextInt();
		if (year%4 == 0  ) {
			System.out.println(" leap year ");
		}
		else
			System.out.println(" normal year ");

				
	}

}