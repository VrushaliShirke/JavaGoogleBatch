package com.day30;

public class Npattern {
	
	public static void patternN(char ch[][]) {
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch[i].length;j++) {
				if(j==0||(i==1 && j==1)||(i==2 && j==2)||j==ch[j].length-1) {
					ch[i][j]='*';
					
				}
				else {
					ch[i][j]=' ';
				}
			}
		}
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch[i].length;j++) {
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		char ch[][]= new char[4][4];
		patternN(ch);
	}
}
