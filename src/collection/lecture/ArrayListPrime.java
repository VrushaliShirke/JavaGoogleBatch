package collection.lecture;
import java.util.*;
public class ArrayListPrime {

	public static void main(String[] args) {
		
		ArrayList<Integer> itr= new ArrayList();
		
		itr.add(34);
		itr.add(67);
		itr.add(47);
		itr.add(40);
		itr.add(55);
		itr.add(22);
		itr.add(7);
		
		for(int i=0;i<itr.size();i++) {
			boolean isPrime=true;
			for(int j=2;j<itr.get(i);j++) {
				if(itr.get(i)%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime==true) {
				System.out.println(itr.get(i));
			}
			
		}

	}

}
