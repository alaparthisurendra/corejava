package info.ionedia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Stringreverse {

	public static void main(String[] args) {
		
		String s1="I know Java";
		String[] ss=s1.split(" ");
		Arrays.asList(ss);
		
		List<String>list=new ArrayList<>(Arrays.asList(ss));
		Collections.sort(list);
		for (String suri : list) {
			System.out.print(suri+" ");
		}
	}

}
