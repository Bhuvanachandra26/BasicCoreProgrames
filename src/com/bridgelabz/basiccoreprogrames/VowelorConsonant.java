package com.bridgelabz.basiccoreprogrames;

import java.util.Scanner;

public class VowelorConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println(" enter a alphabet:  ");

		char c = s.next().charAt(0);
		char vowel = c;
		switch(vowel) {
			case 'a':
				System.out.println(" vowel ");
				break;
			case 'e':
				System.out.println(" vowel ");
				break;
			case 'i':
				System.out.println(" vowel ");
				break;
			case 'o':
				System.out.println(" vowel ");
				break;
			case 'u':
				System.out.println(" vowel ");
				break;
			default:
				System.out.println(" consonent ");
				break;
		}
		
		
	}

}