package com.day34;

import java.util.*;

public class ThreeDigitsSum {

	public static void threeDigitSum(String str) {
		String firstThree = "";
		String lastThree = "";
		int sum1 = 0, sum2 = 0;
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			if((ch[i]>='a' && ch[i]<='z')||(ch[i]>='A' && ch[i]<='Z')) {
				System.out.println("Invalid input");
				break;
			}
		}

		if (str.length() > 2) {
			firstThree = ("" + str).substring(0, 3);
			lastThree = ("" + str).substring(str.length() - 3, str.length());

			for (int i = 0; i < firstThree.length(); i++) {
				int first = Integer.parseInt(firstThree.charAt(i) + "");
				sum1 = sum1 + first;
			}
			for (int i = 0; i < lastThree.length(); i++) {
				int last = Integer.parseInt(lastThree.charAt(i) + "");
				sum2 = sum2 + last;
			}
			System.out.println("Sum of 3=" + sum1);
			System.out.println("Sum of 3= " + sum2);
		} 
		else {
			System.out.println("Error");
		}
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		ThreeDigitsSum.threeDigitSum(s);
	}

}
