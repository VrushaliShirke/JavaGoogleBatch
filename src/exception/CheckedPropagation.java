package exception;

import java.io.IOException;

public class CheckedPropagation {
	
	void m1() throws IOException{
		throw new IOException("Device Error");
	}
	void n1() throws IOException{
		m1();
	}
	void p1() throws IOException{
		n1();
	}

	public static void main(String[] args) {
		
		CheckedPropagation p= new CheckedPropagation();
		try {
			p.m1();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Hii");

	}

}
