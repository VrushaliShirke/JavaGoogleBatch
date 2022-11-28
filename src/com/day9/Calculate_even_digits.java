package com.day9;
import java.util.Scanner;
public class Calculate_even_digits {

	public static void main(String[] args) {
		// calculate even digits from number
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int num= sc.nextInt();
		int count1=0,count2=0;
		while(num>0) {
			int r= num%10;
			if(r%2==0) {
				count1++;
			}
			if(r%2==1) {
				count2++;
			}
			num/=10;
		}
		System.out.println("Count even= "+count1);
		System.out.println("Count odd= "+count2);
	}

}
