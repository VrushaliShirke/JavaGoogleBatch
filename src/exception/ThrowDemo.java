package exception;

public class ThrowDemo {

	public static void isValid(int n) {
		if(n<18) {
			
			throw new ArithmeticException("Invalid Number");
//			System.out.println("good");
		}
		else {
			System.out.println("Valid");
		}
		System.out.println("Hiii");
	}
	public static void main(String[] args) {
		
		try {
			isValid(10);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}

	}

}
