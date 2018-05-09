package info.sapiensinsurancecompany;

public class Program {

	public static void main(String[] args) {
		int i = 10;
		method(i);
		/*method("15");*/
		
	}

	public static void method(Object o) {
		System.out.println("object method");
	}
  
	
	public static void method(long n) {
		System.out.println("long method");
	}
	
	public static void method(Double d) {
		System.out.println("Double method");
	}
	/*public static void method(Number n) {
		System.out.println("Number method");
	}*/
	/*public static void method(int n)
	{
		System.out.println("int method");
	}*/
	
	public static void method(String s)
	{
		System.out.println("string method");
	}
}
