package info.niit;

public class MethodLogic {
	
	public void method(long l)
	{
		System.out.println("long method");
	}
	public void Method(Double d)
	{
		System.out.println("double method");
	}

	public static void main(String[] args) {
		new MethodLogic().Method(100.0);
 
	}

}
