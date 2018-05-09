package info.RealTimeProblemWithMethodOverriding;

//subclass to the BaseProfileFormHandler Class
public class EcommericeProfileFormHandler  extends  BaseProfileFormHandler{
	
	//Overriden method
	public void doLogin()
	{
		super.doLogin();
		System.out.println("EcommericeProfileFormHandler :dologin()");

	
	}
	
	public void preLogin()
	{
		//super.preLogin();
		super.preLogin();
		System.out.println("EcommericeProfileFormHandler :prelogin()");
	}
  //overriden method
	public void postLogin()
	{
		//super.postLogin();
		super.postLogin();
		System.out.println("EcommericeProfileFormHandler :postLogin()");
		//sending sms after succesfull login
	}
}
