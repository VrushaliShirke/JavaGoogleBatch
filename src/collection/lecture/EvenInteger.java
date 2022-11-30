package collection.lecture;
import java.util.*;
public class EvenInteger {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer> even= new ArrayList();
//		for(int i=0;i<=5;i++) {
//			even[i]=sc.nextInt();
//		}
		even.add(34);
		even.add(21);
		even.add(89);
		even.add(44);
		even.add(33);
		even.add(70);
		System.out.println(even);
		
		for(Integer i:even) {
			if(i%2==0) {
				System.out.println(i);
			}
		}

	}

}
