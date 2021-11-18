package com.bridgelabz.basiccoreprogrames;

import java.util.Scanner;

public class SwapTwoNumbers{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println(" enter number 1:  ");

		int n1 = s.nextInt();
		System.out.println(" enter number 2:  ");
		int n2 = s.nextInt();
		
		int temp ;
		temp = n1;
		n1= n2;
		n2 = temp;
		System.out.println(" value of number 1:  " + n1);
		System.out.println(" value of number 2: " + n2);


	
	}

}