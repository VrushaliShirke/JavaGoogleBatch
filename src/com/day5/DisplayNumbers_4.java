package com.day5;

public class DisplayNumbers_4 {

	public static void main(String[] args) {
		// find sum of even number between 1 to 20
		
		int i;
		int sum = 0;
		for(i=1;i<=20;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
			
		}
		System.out.println(sum);
	}

}
