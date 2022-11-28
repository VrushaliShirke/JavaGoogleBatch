package exception;

public class RethrowingException {
	
	public void m1(){
		int count=0;
		
		try {
			count++; //1
			try {
				count++; //2
				try {
					count++; //3
					throw new Exception();
				}
				catch(Exception e) {
					count++; //4
					throw e;
				}
			}
			catch(Exception e) {
				count++; //5
				throw e;
			}
		}
		catch(Exception e) {
			System.out.println(count);
		}
	}

	public static void main(String[] args) {
		
		RethrowingException r= new RethrowingException();
		r.m1();
		

	}

}
