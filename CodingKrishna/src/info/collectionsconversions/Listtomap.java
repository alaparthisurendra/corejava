package info.collectionsconversions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Listtomap {

	public static void main(String[] args) {
		Empolyee empolyee1= new Empolyee(100, "surendra");
		Empolyee empolyee2=new Empolyee(200,"alaparthi");
		Empolyee empolyee3=new Empolyee(300,"Hareesh");
		Empolyee empolyee4=new Empolyee(400,"Abhishekkaran");
		List<Empolyee>list=new ArrayList<>();
		list.add(empolyee1);
		list.add(empolyee2);
		list.add(empolyee3);
		list.add(empolyee4);
		list.forEach(suri->System.out.println(suri));
		
		Map<Integer, Empolyee>map=new HashMap<>();
		map=list.stream().collect(Collectors.toMap(item->item.getEid(), suri-> suri));
		/*map.forEach(k,v) -> System.out.print(k+" -----"+v);*/
		System.out.println(map);
	}
}
