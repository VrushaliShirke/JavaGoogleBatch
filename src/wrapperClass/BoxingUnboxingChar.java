package wrapperClass;

public class BoxingUnboxingChar {

	public static void main(String[] args) {
		
		char c='h';
		Character ch= new Character(c);
		
		Character ch2=c;
		
		Character x=ch.charValue();
		Character x2=ch2;
		
		System.out.println(ch2);
	}

}
