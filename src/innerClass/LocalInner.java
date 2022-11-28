package innerClass;

public class LocalInner {

	public void read() {
		class MethodInnerClass{
			public void show() {
				System.out.println("Hi Local");
			}
		}
		MethodInnerClass m= new MethodInnerClass();
		m.show();
	}
	public static void main(String[] args) {
		
		LocalInner l= new LocalInner();
		l.read();
	}

}
