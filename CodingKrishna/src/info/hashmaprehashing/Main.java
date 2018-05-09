package info.hashmaprehashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empolyee empolyee1 = new Empolyee(1,"surendra","50000");
		Empolyee empolyee2 = new Empolyee(2,"Shekar","30000");
		Empolyee empolyee3 = new Empolyee(3,"Siva","10000");
		Empolyee empolyee4= new Empolyee(4,"Venki","28000");
		Empolyee empolyee5= new Empolyee(5,"Bhanu","35000");
		Empolyee empolyee6= new Empolyee(6,"Venu","25000");
		Empolyee empolyee7= new Empolyee(7,"sanjeev","5000");
		Empolyee empolyee8= new Empolyee(8,"chintu","5000");
		Empolyee empolyee9= new Empolyee(9,"vivek","25000");
		Empolyee empolyee10= new Empolyee(10,"Karthik","25000");
		Empolyee empolyee11= new Empolyee(11,"phany","35000");
		Empolyee empolyee12= new Empolyee(12,"chandu","45000");
		Empolyee empolyee13= new Empolyee(13,"vamshi","15000");
		
		Map<Empolyee, Integer>hm=new LinkedHashMap<>();
		hm.put(empolyee1, 1);
		hm.put(empolyee2, 2);
		hm.put(empolyee3, 3);
		hm.put(empolyee4, 4);
		hm.put(empolyee5, 5);
		hm.put(empolyee6, 6);
		hm.put(empolyee7, 7);
		hm.put(empolyee8, 8);
		hm.put(empolyee9, 9);
		hm.put(empolyee10, 10);
		hm.put(empolyee11, 11);
		hm.put(empolyee12, 12);
		hm.put(empolyee13, 13);
		
		System.out.println(hm.size());
		Set<Entry<Empolyee, Integer>> entrySet=hm.entrySet();
		Iterator<Entry<Empolyee, Integer>> iterator = entrySet.iterator();
		while(iterator.hasNext())
		{
			Entry<Empolyee, Integer> val=iterator.next();
			System.out.println(val.getKey()+" ------------ "+val.getValue());
		}

	}

}
