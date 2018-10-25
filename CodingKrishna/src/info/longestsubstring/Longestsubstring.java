package info.longestsubstring;

import java.util.HashMap;

import java.util.Map;

public class Longestsubstring {

	public static void main(String[] args) {
		System.out.println(longestSubStringInJava("javahashmap"));
	}

	private static int longestSubStringInJava(String s) {
		int max=0;
		char[] ch=s.toCharArray();
		Map<Character, Integer>hashMap=new HashMap<>();
		for(int i=0; i<ch.length; i++)
		{
			if(!hashMap.containsKey(ch[i]))
			{
				hashMap.put(ch[i], 1);
			}
			else
			{
				if(max < hashMap.size())
				{
					max=hashMap.size();
					i=hashMap.get(ch[i]);
					hashMap.clear();
				}
			}
		}
		return max > hashMap.size()? max:hashMap.size();
		
		
	}

}
