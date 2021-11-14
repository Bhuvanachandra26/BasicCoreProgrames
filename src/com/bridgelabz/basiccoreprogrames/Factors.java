package com.bridgelabz.basiccoreprogrames;

import java.util.Scanner;

public class Factors {
	public static void main(String [] args){
		
	Scanner s = new Scanner(System.in);
	System.out.println(" enter a number : ");
	int n = s.nextInt();
	
	for(int i = 2; i< n; i++) {
        while(n%i == 0) {
           System.out.println(i+" ");
           n = n/i;
        }
     }
     if(n >2) {
        System.out.println(n);
     }
	
		
		
	}
	
}