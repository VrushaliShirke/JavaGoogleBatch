package exception;

public class NestedDemo {

	public static void main(String[] args) {
		
		try {
			try {
				
				int x=10;
				System.out.println(x/0);
			}
//			catch(NullPointerException e) {
//				System.out.println("Hii"+e.getMessage());
//			}
			catch(ArithmeticException e) {
				System.out.println("Hii"+e.getMessage());
			}
		}
		catch(Exception e) {
			System.out.println("Hello"+e.getMessage());
		}

	}

}
