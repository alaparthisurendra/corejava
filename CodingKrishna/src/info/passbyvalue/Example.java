package info.passbyvalue;

public class Example {

	public void change(int x) {
		x = x * 2;
		System.out.println("x:"+x);
	}

	public static void main(String[] args) {
		int x=100;
		Example ee = new Example();
		ee.change(x);
		System.out.println(x);
		//x is equal to 100 because java using pass by reference
		//primitive values:
		//In java when u pass primitive value the original will not effected

	}

}
