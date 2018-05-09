package info.techm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Integerarraylogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 212, 245, 421 };
		Map<Character, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < num.length; i++) {
			char[] charArray = String.valueOf(num[i]).toCharArray();
			for (int j = 0; j <charArray.length; j++) {
				if (hashMap.containsKey(charArray[j])) {
					hashMap.put(charArray[j], hashMap.get(charArray[j]) + 1);
				} else {
					hashMap.put(charArray[j], 1);
				}
			}
		}

		/*System.out.println(hashMap);*/
		for (Map.Entry<Character, Integer> map : hashMap.entrySet()) {
			Character key = map.getKey();
			Integer value = map.getValue();
			System.out.println("key:" + key + " ======== " + "value:" + value);
		}

	}

}
