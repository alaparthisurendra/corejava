package info.string;

import java.util.ArrayList;
import java.util.List;

public class Stringlogic {

	public static void main(String[] args) {
		String s1="surendra";
		//System.out.println(s1);
		s1="alaparthi";
		//System.out.println(s1);
		List<String>aList=new ArrayList<>();
		aList.add(s1);
		
		List<String>arrayList=new ArrayList<>();
		arrayList.add("suri");
		arrayList.addAll(aList);
		for (String string : arrayList) {
			System.out.println(string);
		}
		
	}

}
