package wrapperClass;

public class BoxingUnboxingBoolean {

	public static void main(String[] args) {

		boolean b=true;
		
		Boolean bn= new Boolean(b);
		
		Boolean bn2=b;
		
		Boolean x= bn.booleanValue();
		Boolean x2=bn2;

//		System.out.println(x);
	}

}
