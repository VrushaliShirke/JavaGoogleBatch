package wrapperClass;

public class AutoWideningDemo {
	
	public static void m1(int x) {
		System.out.println("Int");
	}
	
	public static void m1(long l) {
		System.out.println("Long");
	}

	public static void main(String[] args) {
		
		int x=10;
		m1(10);

	}

}
