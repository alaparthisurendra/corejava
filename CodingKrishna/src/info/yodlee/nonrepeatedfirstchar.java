package info.yodlee;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import info.hashmaplogic.Hashmap;

public class nonrepeatedfirstchar {

	static Map<Character, Integer> hashMap;
	static Character c;

	public static void main(String[] args) {
		
		String s = "Surendra";
		nonRepeatedFirstChar(s);
	
	}

	private static void nonRepeatedFirstChar(String s) {

		char ch[] = s.toCharArray();
		for (char suri : ch) {
			hashMap = new HashMap<>(s.length());
			if (hashMap.containsKey(suri)) {
				hashMap.put(suri, hashMap.get(suri) + 1);
			} else {
				hashMap.put(suri, 1);
			}
		}
		Set<Character> set=hashMap.keySet();
		for(Character suri: set)
		{
			if(hashMap.get(suri) > 1)
			{
				System.out.println(c+"==================="+hashMap.get(c));
			}
		}

	}

}
