package collection.lecture;
import java.util.*;
public class SumArrayList {
	
	public static void main(String[] args) {
	
		ArrayList<Integer> itr=new ArrayList();
		itr.add(23);
		itr.add(89);
		itr.add(20);
		itr.add(10);
		int sum=0;
		for(Integer i:itr) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
