package exception;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

class Animal{
	// rule-1: Parent doesn't declare any exception.
	
//	public void run() {
//		
//	}
	
	// rule-2: Parent declare exception
	
	public void run() throws IOException{
		
	}
}

public class Dog {

	// rule-1: Child also not declare any exception or only declare unchecked type exception but can't declare checked exception.
	
//	@Override public void run() throws NullPointerException{
//															// Allowed  ????
//	}
	
//	public void run() throws SQLException{
//												//error
//	}
	
	// rule-2-(1): child not declare exception allowed
//	public void run() {
//		
//	}
	
	// rule-2-(2): child can declare same exception like parent or child-exception of parent exception
//	public void run() throws IOException {
//		
//	}
//	public void run() throws FileNotFoundException {
//		
//	}
	
	// rule-2-(3): Child can't declare parentException of parent class method exception.
	public void run() throws Exception{
							//  Error ?????
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
