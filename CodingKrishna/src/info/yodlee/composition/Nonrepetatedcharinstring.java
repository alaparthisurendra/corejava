

package info.yodlee.composition;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Nonrepetatedcharinstring {

	public static void main(String[] args) {
		Countchar("alaparthii");
	}

	private static void Countchar(String suri) {
		Map<Character, Integer>hm=new HashMap<Character, Integer>();
		Integer max=1;
		char ch[]=suri.toCharArray();
		for (Character c : ch) {
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
     Set<Character> keySet = hm.keySet();
     for (Character ccc : keySet) {
		if(hm.get(ccc) > max)
    	{
    		System.out.println(ccc+" -------------"+hm.get(ccc));
    	}
		
	}
		
		
	}

}
