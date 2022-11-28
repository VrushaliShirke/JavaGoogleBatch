package innerClass;

public class StaticOuter {
	
	static int x=20;
	static class MyStatic{
		void diaplay() {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		StaticOuter.MyStatic in= new StaticOuter.MyStatic();
		in.diaplay();

	}

}
