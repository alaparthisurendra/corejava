package info.typecasting;

class Mobile {
	public void calling() {
		System.out.println("calling method..");
	}
}

class Samsung extends Mobile {
	public void calling() {
		System.out.println("samsung calling");
	}

	public void camera() {
		System.out.println("taking photots from samsung");
	}
}

public class Upcastingmobile {

	public static void main(String[] args) {
		//Exclipt type casting
		Samsung s = new Samsung();
		Mobile m = s;
		m.calling();
		
		//implict type casting both are same we frequently we use below type
		Mobile mm=new Samsung();
		mm.calling();
		
		/* compile type error
		 * Samsung ss=new Samsung(); Object obj=(Mobile)ss; obj.calling();
		 */

	}

}
