package info.deloite;

public class Construcorlogic {

	int i;
	int j;
	public Construcorlogic() {
		i = 1;
		/*
		 * i++; j=7;
		 */
	}

	public Construcorlogic(int a, int b) {
		System.out.println(i);
		System.out.println(j);
		j = b;
		i = a;
	}

	public static void main(String[] args) {
		Construcorlogic cl = new Construcorlogic(2, 4);
		System.out.println(cl.i);
		System.out.println(cl.j);
		System.out.println("--------------");
		Construcorlogic c = new Construcorlogic();
		System.out.println(c.i);
		System.out.println(c.j);

	}

}
