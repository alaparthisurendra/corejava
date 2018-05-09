package info.collectionsconversions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maptolist {

	public static void main(String[] args) {
		Empolyee empolyee1= new Empolyee(100, "surendra");
		Empolyee empolyee2=new Empolyee(200,"alaparthi");
		Empolyee empolyee3=new Empolyee(300,"Hareesh");
		Empolyee empolyee4=new Empolyee(400,"Abhishekkaran");
		Map<Empolyee, Integer>hmap=new HashMap<>();
		hmap.put(empolyee1, 1);
		hmap.put(empolyee2, 2);
		hmap.put(empolyee3, 3);
		hmap.put(empolyee4, 4);
		System.out.println("----------------------");
		Set<Empolyee> keySet = hmap.keySet();
		List<Empolyee>list=new ArrayList<>(keySet);
		for (Empolyee empolyee : list) {
			System.out.println(empolyee.getEid()+" === "+empolyee.getEname());	
		}
		
		
		
		System.out.println("----------------------");
		Collection<Integer> values = hmap.values();
		List<Integer> ll=new ArrayList<>(values);
		System.out.println(ll);
		
        System.out.println("---------------------------");
        Set<Entry<Empolyee, Integer>> entrySet = hmap.entrySet();
        List<Entry<Empolyee, Integer>>ls=new ArrayList<>(entrySet);
        Iterator<Entry<Empolyee, Integer>>itr=ls.iterator();
        while(itr.hasNext())
        {
        	Entry<Empolyee, Integer> entry=itr.next();
        	System.out.println(entry.getKey()+"----------"+entry.getValue());
        }
        
        
	}

}
