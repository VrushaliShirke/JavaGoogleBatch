package collection.lecture;
import java.util.*;
public class MethodDemo {

	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList();
		al.add("Pune");
		al.add("Mumbai");
		al.add("Nasik");
		al.add("Goa");
		System.out.println(al);
		ArrayList<String> al2= new ArrayList();
		al2.add("Nagpur");
		al2.add("Gujarat");
		al2.add("Pune");
		
//		al2.addAll(al);
		al2.addAll(0, al2);
		System.out.println(al2);
		
//		al2.remove(al);
		
		al2.retainAll(al);
		System.out.println(al);

	}

}
