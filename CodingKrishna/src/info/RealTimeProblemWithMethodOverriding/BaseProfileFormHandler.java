package info.RealTimeProblemWithMethodOverriding;
//problem faced in ecommerce application

//commom class for across all the forms where it to validations and loggings

public class BaseProfileFormHandler {

	// Actual method where i call the login. internally calls the
	// prelogin and postlogin methods.
	public void doLogin() {
		System.out.println("BaseProfileFormHandler doLogin()");
		this.preLogin();
		
		this.postLogin();
	}
	public void preLogin() {
	//validation and getting values from database
		System.out.println("BaseProfileFormHandler prelogin()");
	}
	public void postLogin() {
		System.out.println("BaseProfileFormHandler postLogin()");
	}
}
