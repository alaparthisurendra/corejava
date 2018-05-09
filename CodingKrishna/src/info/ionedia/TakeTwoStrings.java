package info.ionedia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TakeTwoStrings {

	public static void main(String[] args) {
		
		String s1="suri";
		String s2="surendraa";
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		for(char ch:ch2)
		{
			
			List<Character> list=new ArrayList<>();
			if(list.contains(ch))
			{
				list.remove(ch);
			}
			else 
			{
				list.add(ch);
			}
			System.out.println(list);
			if(list.contains(ch1))
			{
				list.remove(ch1);
				list.remove(ch);
			}
			}
		
		
		}
	

}
