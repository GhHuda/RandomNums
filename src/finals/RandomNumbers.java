package finals;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class RandomNumbers {
	public static void main(String[] args) {
		
		rannum(500,9);

	}

	public static void rannum(int count, int nth) {
		Random random = new Random();

		Set<Integer> num = new TreeSet<Integer>();
		while (num.size() < count) {

			int randomn = random.nextInt(901) + 100;

			num.add(randomn);

		}
		System.out.println(num);
		Object[] x = num.toArray();	        
	    System.out.println(x[nth]);	    }



}