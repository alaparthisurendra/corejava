package info.deloite;

public class Methodlogic {

	public static void main(String[] args) {
		Methodlogic m = new Methodlogic();
		System.out.println(m.method());

	}

	public Double Method() {
		System.out.println("String");
		return 100.0;

	}

	public int method() {
		System.out.println("int");
		return 10;

	}

	/*
	 * public Float method() { System.out.println("float"); return 100f; }
	 */
	public Character method1() {
		System.out.println("char");
		return 'c';
	}

}
