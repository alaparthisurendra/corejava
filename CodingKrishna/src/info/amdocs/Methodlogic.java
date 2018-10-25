package info.amdocs;

public class Methodlogic {

	public static void main(String[] args) {
		System.out.println(method1(10,20));
		System.out.println(method2(25,50));
	}
    private static int method2(int x, int y) {
		x=x+y;
		return x ;	
	}
	private static int method1(int x, int y) {
	 x+=y ;
	 return x;	
	}
}
