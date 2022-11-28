package exception;
import java.util.*;

class NegativeValueException extends Throwable{
	
	NegativeValueException(String s){
		super(s);
	}
	
}
public class CustomExceptionDemo {

	public static void check(int n) throws NegativeValueException{
		if(n<0) {
			 throw new NegativeValueException("Number is negative");
		}
	}
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		try {
			check(n);
		}
		catch(NegativeValueException e) {
			System.out.println(e.getMessage());
		}

	}

}
