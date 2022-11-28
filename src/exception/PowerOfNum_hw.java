package exception;
import java.util.*;
class InvalidExponentException extends Throwable
{
	public InvalidExponentException(String s)
	{
		super(s);
	}	
}
public class PowerOfNum_hw {

	public static void check(int b,int x) throws InvalidExponentException
	{
		if(x==0 || x<0)
		{
			throw new InvalidExponentException("Invalid exponent value entered");
		}else {
			System.out.println(Math.pow(b, x));
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of base : ");
		int base=sc.nextInt();
		System.out.println("Enter value of exponent : ");
		int expo=sc.nextInt();
		try {
			check(base,expo);
		}catch(InvalidExponentException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
