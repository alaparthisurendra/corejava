package info.yodlee;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmaplogic {
	public static void main(String[] args)
	{
		Map<Empolyee, Integer>hmmap=new HashMap<>();
		hmmap.put(new Empolyee("1"), 1);
		hmmap.put(new Empolyee("2"), 2);
		hmmap.put(new Empolyee("1"),100);
	    //Set<Empolyee> keySet = hmmap.keySet();
	    System.out.println(hmmap.get("2"));
		System.out.println(hmmap.get(new Empolyee("1")));
		
	}

}
