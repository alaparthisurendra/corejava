package info.RealTimeProblemWithMethodOverriding;

public class Main {

	public static void main(String[] args) {

		/*BaseProfileFormHandler bb = new BaseProfileFormHandler();
		bb.doLogin();*/
		/*
		 * Output is for above code: 
		 * BaseProfileFormHandler doLogin
		 * BaseProfileFormHandler prelogin 
		 * BaseProfileFormHandler postLogin
		 */

		BaseProfileFormHandler bbb = new EcommericeProfileFormHandler();
		bbb.doLogin();

	}

}
