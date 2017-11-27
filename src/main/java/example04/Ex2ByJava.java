package example04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex2ByJava {
	public static void main(String[] args) throws FileNotFoundException {

		try (Scanner in = new Scanner(new File("src/example04/file"))) {
			Map<String, Integer> maps = new HashMap<>();

			String key = null;
			while (in.hasNext()) {
				key = in.next();
				maps.put(key, maps.getOrDefault(key, 0) + 1);
			}
			maps.forEach((k, v) -> System.out.println(k + "->" + v));
		} finally {

		}
	}
}
