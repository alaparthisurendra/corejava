package info.keyandmultiplevalues;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {
		HashMap<String, List<Student>> map = new HashMap<String, List<Student>>();

		Student student1 = new Student(201, "surendra", "kakatiya high school", "10th");
		List<Student> list1 = new ArrayList<>();
		list1.add(student1);

		Student student2 = new Student(210, "vishnu", "st annos", "10th");
		List<Student> list2 = new ArrayList<>();
		list2.add(student2);
		
		map.put("suri", list1);
		map.put("vis", list2 );

		for (Entry<String, List<Student>> entry : map.entrySet()) {
			String key = entry.getKey();
			List<Student> values = entry.getValue();
			System.out.println(key + " ----------------------" + values);
		}

	}

}
