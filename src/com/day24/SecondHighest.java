package com.day24;

public class SecondHighest {
	public static int secondHighest(int[] a) {
		int high1= Integer.MIN_VALUE;
		int high2= Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>high1) {
				high2=high1;
				high1=a[i];
			}
			else if(a[i]>high2) {
				high2=a[i];
			}
		}
		return high2;
	}

	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};		
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			if(SecondHighest.secondHighest(a)>a[i]) {
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}

}
