package info.niit;

public class Numberaddition {

	static int value=0;
	public static void main(String[] args) {
		System.out.println(NumberAdding(225));
	}

	private static int NumberAdding(int num) {
		if(num==0) {
			return 0;
		}
		else
		{
			value+=(num%10);
			NumberAdding(num/10);
		}
		return value;
		
	}

}
