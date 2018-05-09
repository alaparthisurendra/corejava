package info.hashmapequalsandhashcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Client {

	public static void main(String[] args) {
		Map<Empolyee, Department>hashMap=new LinkedHashMap<>();
		hashMap.put(new Empolyee(1,"surendra","50000","2.9"),
				new Department(100,"it","bangalore"));
		hashMap.put(new Empolyee(2,"alaparthi","35000", "2.6"),
				new Department(200,"non_it","hyderabad"));
		
		hashMap.put(new Empolyee(4,"siva","15000","2.0"), 
				new Department(300,"Support","hyderabad"));
		
		hashMap.put(new Empolyee(5,"Bhanu","35000","3.0"), 
				new Department(100,"it","hyderabad"));
		hashMap.put(new Empolyee(3,"venu","25000","5.0"), 
				new Department(500,"aeronatics","hyderabad"));
		System.out.println(hashMap.size());
		
		Set<Entry<Empolyee,Department>> set=hashMap.entrySet();
		for(Entry<Empolyee,Department> val:set)
		{
			System.out.println(val.getKey()+" "+val.getValue());
		}
		
		System.out.println(hashMap.get(new Empolyee(1,"surendra","50000","2.9")));

	}

}
