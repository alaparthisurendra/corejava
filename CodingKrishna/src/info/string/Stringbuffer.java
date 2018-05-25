package info.string;

class String {
	public void method(java.lang.String string) {
		System.out.println("looking for string..parent");
	}

	public void method(StringBuffer sb) {
		System.out.println("looking for Stringbuffer...parent");
	}
}

public class Stringbuffer extends String {

	public static void main(String[] args) {
		String sb = new Stringbuffer();
	     sb.method("ss");
	}

	public void method(String s) {
		System.out.println("looking for string..");
	}

}
