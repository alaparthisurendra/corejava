package info.pangram;

import java.util.Arrays;

public class Pangram {

	public static void main(String[] args) {
		String s1="The five boxing wizards jump quickly";
		int[] ascii=new int[128];
		char[] array=s1.toLowerCase().toCharArray();
		for(int i=0; i< array.length; i++)
		{
			int suri=array[i];
			System.out.println(suri);
			if(suri< 128)
			{
				ascii[suri]+=1;
			}
		}
		/*System.out.println(Arrays.toString(ascii));*/
		
		for(int i=97; i<=122;i++)
		{
			if(ascii[i]==0)
			{
				System.out.println("not  pangram");
				System.exit(0);
			}	
		}
		System.out.println("pangram");
	}

}
