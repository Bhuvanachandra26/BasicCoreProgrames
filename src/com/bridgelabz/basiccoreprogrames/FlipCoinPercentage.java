package com.bridgelabz.basiccoreprogrames;

public class FlipCoinPercentage {
	public static void main(String[] args) {
				
		
		float head = 0;
		float tail = 0;
		float  headAvarage = 0;
		float tailAvarage = 0;
			for(int i=0;i<10; i++) {
			double toss = (Math.random()) ;
			  if(toss <0.5) {
				 tail = tail+1;
				  }else {
			  			head = head+1;
				  }
			  
			  	}
			System.out.println("number of heads: " +head);
			System.out.println("number of tails: " +tail);
			headAvarage = (head/10)*100;
			tailAvarage = (tail/10)*100;
			System.out.println("head percentage: "+headAvarage);
			System.out.println("tail percentage:  "+tailAvarage);


	}

}
