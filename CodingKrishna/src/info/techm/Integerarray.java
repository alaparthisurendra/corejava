package info.techm;

import java.util.HashMap;
import java.util.Map;

public class Integerarray {

	public static void main(String[] args) {
		int[] num = { 1, 2, 4, 5, 1, 8, 4, 5, 1 };
		countNumbers(num);
	}

	private static void countNumbers(int[] numbers) {
		Map<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			if (hashMap.containsKey(numbers[i])) {
				hashMap.put(numbers[i], hashMap.get(numbers[i])+1);
			}
			else {
			hashMap.put(numbers[i], 1);
			}
		}
		System.out.println(hashMap);
		/*for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			Integer key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + "------------------" + value);
		}*/
	}
}
