package collection.lecture;

import java.util.*;

public class CollectionDemo1 {

	public static void main(String[] args) {
		
		ArrayList list= new ArrayList();
		list.add("Pune");
		list.add(56);
		list.add(67.08f);
		list.add('r');
		System.out.println(list);
		System.out.println("..........................................");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(i+" "+list.get(i));
		}
		
		
	}

}
