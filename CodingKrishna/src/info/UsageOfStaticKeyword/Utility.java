package info.UsageOfStaticKeyword;

public class Utility {
	public static void sendSMS(String form, String to) {
		System.out.println("sending sms from:" + form +  "to:" + to);
	}

	public  static void sendEmail(String from, String to) {
		System.out.println("Sending Email from:" + from +  "to:" + to);
	}

}
