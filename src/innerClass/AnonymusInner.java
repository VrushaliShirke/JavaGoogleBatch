package innerClass;

abstract class MyClass{
	
	abstract void run();
}
public class AnonymusInner {

	public static void main(String[] args) {
		
		MyClass c= new MyClass()
		{
			void run() {
				System.out.println("Class running.....");
			}
		};
		c.run();
	}

}
