package discover.smallskill;

import java.util.Arrays;
import java.util.stream.Stream;

class ArrayOperJava {

	public static void main(String[] args) {
		Object[] array = new Object[] { 1, 2, 3, 1, 'a', 1, 'a' };
		
		filterEqual(array).forEach(x -> System.out.print(x + " "));
	}
	
	public static Stream<Object> filterEqual(Object[] array) {
		return  Arrays.stream(array).distinct();
	}
}