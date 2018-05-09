package info.deloite;

public class Exceptionlogic {

	public static void main(String[] args) {

		try {
			System.out.println("inside try");
		method();	
		}
		catch (ArithmeticException e) {
			System.out.println("catched ArithmeticException");
		}catch (Exception e) {
			System.out.println("catched Exception");
		} finally {
			System.out.println("inside finally");
		}
		System.out.println("surendra");

	}

	private static void method() {
       System.out.println("inide mehtod");
		throw new ArithmeticException();
	}

}
