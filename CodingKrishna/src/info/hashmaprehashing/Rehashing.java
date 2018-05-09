package info.hashmaprehashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Rehashing {

	public static void main(String[] args) {
		Map<String, Integer>hashMp=new HashMap<>();
		hashMp.put("Surendra", 24);
		hashMp.put("karthik", 22);
		hashMp.put("Venkatesh", 25);
		hashMp.put("Shekar", 27);
		hashMp.put("Siva", 25);
		hashMp.put("Bhanu", 25);
		hashMp.put("Vamshi", 23);
		hashMp.put("Vivek", 20);
		hashMp.put("Chintu", 21);
		hashMp.put("Sravan", 22);
		hashMp.put("Sanjeev", 21);
		hashMp.put("venkiA", 22);
		hashMp.put("Kiran", 25);
		hashMp.put("Chandu", 23);
		
		System.out.println(hashMp.size());
		
		Set<Entry<String,Integer>> set=hashMp.entrySet();
		for(Entry<String, Integer> entry:set)
			System.out.println(entry.getKey()+" "+entry.getValue());
	}

}
