package info.string;

public class Stringlogic1 {

	public static void main(String[] args) {
		String s1="naveen";
		String s2="naveen";
		String s3=s2;
		/*String s4=s1;*/
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		//System.out.println(s3.equals(s4));
		System.out.println(s3==s2);
		//here below create new String in string constant pool 
		//once you have defined string we can't change the value
		//here we are changing reference
		 
		/*stack   heap
		s1 100  string constant pool
		s2 100  100 naveen*/
		
		/*stack   heap
		 // here reference is changing 
		 // doesnt effect on s2  
		s1 110  string constant pool
		s2 100  100 naveen
		        110 reddy
		*/
		
		/* NOTE: Every time we are changing the value of s1. you actually changing the address
		u getting new object  your not changing the existing value.*/
		s1="reddy";
		String s4=s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s3.equals(s1));
		System.out.println(s3.equals(s2));
		System.out.println(s4.equals(s1));
	}

}
