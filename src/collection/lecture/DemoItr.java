package collection.lecture;
import java.util.*;
public class DemoItr {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList();
		al.add("Pune");
		al.add("Mumbai");
		al.add("Nasik");
		al.add("Nagpur");
		al.add("Bengluru");
		al.add("Panji");
		
		System.out.println(al);
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			String s=itr.next();
			if(s.equals("Bengluru")) {
//				al.remove(s);        //   not getting error???
				itr.remove();
			}
		}
		System.out.println(al);
	}

}
