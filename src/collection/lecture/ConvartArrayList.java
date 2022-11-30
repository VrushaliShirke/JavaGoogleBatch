package collection.lecture;
import java.util.*;
public class ConvartArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList();
		al.add(23);
		al.add(56);
		al.add(12);
		al.add(22);
		al.add(0,88);
		
		System.out.println(al);
		al.set(2,1);
		System.out.println(al);
		
		Object[] myArray=al.toArray();
		System.out.println(Arrays.toString(myArray));
		System.out.println("//////////////////////////");
		
		Integer[] marks= al.toArray(new Integer[al.size()]);
		
		for(Integer i:marks) {
			System.out.println(i);
		}
		System.out.println("//////////////////////////");
		
		Integer[] a= new Integer[al.size()];
		for(int i=0;i<a.length;i++) {
			a[i]=al.get(i);
		}
				
		System.out.println(Arrays.toString(a));
	}

}
