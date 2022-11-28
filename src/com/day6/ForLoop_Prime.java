package com.day6;
import java.util.Scanner;
public class ForLoop_Prime {

	public static void main(String[] args) {
		// Prime numbers using for loop:
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		boolean isPrime=true;
		int i;
		for( i=2;i<num;i++) {
			
		if(num%i==0) {
			isPrime=false;
			break;	
		}
		
		
		sc.close();
		}
		if(isPrime==true) {
			System.out.println("prime");
		}
		else {
			System.out.println("non-prime");
		}
	}

}
