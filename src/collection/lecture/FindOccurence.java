package collection.lecture;
import java.util.*;
public class FindOccurence {
	public static void find(ArrayList<String> al) {
		for(int i=0;i<al.size();i++) {
			int count=1;
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i).equals(al.get(j))) {
					count++;
					al.remove(j);
					j--;
				}
			}
			System.out.println(al.get(i)+" "+count);
		}
	}

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList();
		list.add("Red");
		list.add("Red");
		list.add("Green");
		list.add("Pink");
		list.add("Red");
		list.add("Pink");
		
		find(list);

	}

}
