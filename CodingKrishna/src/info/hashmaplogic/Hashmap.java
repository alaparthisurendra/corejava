package info.hashmaplogic;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {
	static Map<Integer, Integer> hm;
	static Map<Integer, Integer> hashMap;
	public static void main(String[] args) {

		 Integer count=0;
		 Integer key = null;
		 hm = new LinkedHashMap<>();
		hashMap=new HashMap<>();
		hm.put(1000, 5);
		hm.put(1010, 10);
		hm.put(1020, 15);
		hm.put(1030, 20);
		hm.put(1040, 25);
		hm.put(1050, 30);
		hm.put(2000, 50);
		hm.put(2010, 100);
		hm.put(2020, 500);
		hm.put(2050, 1000);
		
	 int answer= getvalues();
	  System.out.println(answer);
	 System.out.println("=============");
	 
	 Set<Entry<Integer, Integer>> entrySet = hashMap.entrySet();
	 for (Entry<Integer, Integer> entry : entrySet) {
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	  
		
	}
			
			public static int getvalues() {
				int num = 0;
				int suri=0;
				Integer key=null;
				Set<Entry<Integer, Integer>> entrySet = hm.entrySet();
				for (Entry<Integer, Integer> entry : entrySet) {
					key=entry.getKey();
					Integer value=entry.getValue();
					if(key <=1100)
					{
						
					     num=entry.getValue();
					      suri=suri+num;
				}
				}
				hashMap.put(key, suri);
				return suri;
			}
		
	

			
}
				