package exception;

public class Test2 {

	public static void main(String[] args) {
		
		System.out.println("hii");
		try {
			System.out.println(10/0);
			System.out.println("hello");
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("I am finally");
		}
		System.out.println("Welcome");
	}

}
