package innerClass;

public class Outer {

	private int x=10;
	class Inner{
		void display() {
			System.out.println("x outer="+x);
		}
	}
	public static void main(String[] args) {
		
		Outer out= new Outer();
		Outer.Inner in=out.new Inner();

		in.display();
	}

}
