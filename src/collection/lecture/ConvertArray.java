package collection.lecture;
import java.util.*;
public class ConvertArray {

	public static void main(String[] args) {
		
		String []s= {"Red","Green","Black","Blue"};
		
		ArrayList<String> al=new ArrayList();
		Collections.addAll(al, s);
		System.out.println(al);
		
		ArrayList<String> al2= new ArrayList();
		for(int i=0;i<s.length;i++) {
			al2.add(s[i]);
		}
		System.out.println(".....................");
		System.out.println(al);
//		ArrayList<String> al=new ArrayList(Arrays.asList(s));
//		System.out.println(al);
//		System.out.println(al.size());
//		al.remove(1);
//		System.out.println(al);
//		al.remove("Red");
//		System.out.println(al);
//		System.out.println(al.isEmpty());
//		System.out.println(al.contains("Black"));
//		al.clear();
//		System.out.println(al);
//		System.out.println(al.isEmpty());

	}

}
