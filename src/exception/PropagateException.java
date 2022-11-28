package exception;

public class PropagateException {
	
	public void m1() {
		
		throw new NullPointerException("Null value");
	}
	
	public void n1() {
		m1();
	}
	
	public void p1() {
		try {
			n1();
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Hii");
	}
	
	public static void main(String[] args) {


		PropagateException e= new PropagateException();
		e.p1();
		System.out.println("Done");

	}

}
