package info.deloite;

public class Stringlogic {

	public static void main(String[] args) {
		String s = "a=10, b=20, c=30, d=40, e=50";
		/*
		 * for(String s1: s.split(",")) { System.out.println(s1); }
		 */
		String[] suri = s.split(",");
		for (int i = 0; i < suri.length; i++) {
			System.out.println(suri[i]);
		}

	}

}
