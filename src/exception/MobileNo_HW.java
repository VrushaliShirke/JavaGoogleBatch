package exception;
import java.util.*;
class InvalideMobileNoException extends Throwable{
	InvalideMobileNoException(String s){
		super(s);
	}
}
public class MobileNo_HW {

	public static void check(String s) throws InvalideMobileNoException{
		char[] st=s.toCharArray();
		if(st.length!=10) {
			throw new InvalideMobileNoException("Please enter valid mobile number");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the mobile number:");
		String str= sc.next();
		try {
			check(str);
		}catch(InvalideMobileNoException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
