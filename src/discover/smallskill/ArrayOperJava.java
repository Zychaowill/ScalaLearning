package discover.smallskill;

import java.util.Arrays;
import java.util.stream.IntStream;

class ArrayOperJava {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 1, 'a', 1, 'a' };
		
		filterEqual(array).forEach(x -> System.out.println(x));
	}
	
	public static IntStream filterEqual(int[] array) {
		return  Arrays.stream(array).distinct();
	}
}