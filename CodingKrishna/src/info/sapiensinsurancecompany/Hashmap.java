package info.sapiensinsurancecompany;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		Map<Integer,Integer>hashMap=new HashMap<>();
		hashMap.put(new Integer(1), 1);
		hashMap.put(new Integer(2), 2);
		hashMap.put(new Integer(2),3);
		
		Set<Entry<Integer, Integer>> entrySet = hashMap.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			System.out.println(entry.getKey()+" =-----"+entry.getValue());
		}
		
		
	}

}
