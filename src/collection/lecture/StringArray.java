package collection.lecture;
import java.util.*;
public class StringArray {

	public static void main(String[] args) {
		
		ArrayList<String> str= new ArrayList();
		
		str.add("Rakesh");
		str.add("Jyoti");
		str.add("Megha");
		str.add("Om");
		str.add("Geet");
//		System.out.println(str);
//		System.out.println("..........................................");
//		for(int i=0;i<str.size();i++) {
//			System.out.println(str.get(i));
//		}
//		System.out.println("..........................................");
//		for(String s:str) {
//			System.out.println(s);
//		}
//		System.out.println("..........................................");
		Iterator<String> st=str.iterator();
		while(st.hasNext()) {
			System.out.println(st.next());
		}
		System.out.println("..........................................");
		
		ListIterator<String> st1=str.listIterator();
		while(st1.hasNext()) {
			st1.next();
		}
		while(st1.hasPrevious()) {
			System.out.println(st1.previous());
		}

	}

}
