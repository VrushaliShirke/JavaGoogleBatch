package collection.lecture;
import java.util.*;
public class GenericCollection {

	public static void main(String[] args) {
		
//		ArrayList<Integer> al1= new ArrayList<Integer>();
//		ArrayList<Integer> al2= new ArrayList();
		ArrayList<Integer> al= new ArrayList();
		
		al.add(89);
		al.add(56);
		al.add(23);
		al.add(90);
		al.add(89);
		System.out.println(al);
//		System.out.println("..........................");
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//		}
//		System.out.println("..........................");
//		for(Integer i:al) {
//			System.out.println(i);
//		}
//		System.out.println("..........................");
//		Iterator<Integer> itr=al.iterator();
//		while(itr.hasNext()) {
//			Integer x=itr.next();
//			System.out.println(x);
//		}
//		System.out.println("..........................");
		
		ListIterator<Integer> li= al.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
			li.next();
		}
//		System.out.println("..........................");
//		while(li.hasPrevious()) {
//			System.out.println(li.previous());
//		}
//		ListIterator<Integer> li=al.listIterator(al.size());
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
