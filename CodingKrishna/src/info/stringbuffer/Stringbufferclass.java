package info.stringbuffer;

public class Stringbufferclass {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Bangalore");
		sb.append("Karnataka");
		System.out.println(sb);
		
		System.out.println("-------");
		
		final StringBuffer sbuffer = new StringBuffer("surendra");
		sbuffer.append("alaparthi");
		System.out.println(sbuffer);
	}

}