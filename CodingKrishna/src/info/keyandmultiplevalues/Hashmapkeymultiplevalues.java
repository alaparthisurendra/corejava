package info.keyandmultiplevalues;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmapkeymultiplevalues {

	public static void main(String[] args) {

		HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>();
		
		List<String>list1=new ArrayList<>();
		list1.add("surendra");
		list1.add("alaparthi");
		list1.add("kakatiya");
		
		List<String>list2=new ArrayList<>();
		list2.add("vishnu");
		list2.add("vardhan");
		list2.add("stann's");
		
		hashMap.put("suri", list1);
		hashMap.put("ala", list2);
		
		Set<Entry<String, List<String>>> entrySet = hashMap.entrySet();
		Iterator<Entry<String, List<String>>> iterator = entrySet.iterator();
		while(iterator.hasNext())
		{
			Entry<String, List<String>> next = iterator.next();
			String key = next.getKey();
			List<String> value = next.getValue();
			System.out.println(key+"------------"+value);
		}

	}

}
