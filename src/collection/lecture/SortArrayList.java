package collection.lecture;
import java.util.*;
public class SortArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList();
		
		
		list.add(34);
		list.add(37);
		list.add(67);
		list.add(20);
		list.add(0);
		
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(j)<list.get(i)) {
					int tmp = list.get(i);
		            list.set(i, list.get(j));
	                list.set(j, tmp);

				}
			}
		}
		for (int i: list) {
		    System.out.print(i+" ");
		}
	}

}
