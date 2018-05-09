package info.UsageOfStaticKeyword;

public class Appmain {

	public static void main(String[] args) {
		String mobileNumber = "8838223993";
		String email = "surendraalaparthi12@gmail.com";

		Student student = new Student();
		student.id = 1;
		student.name = "surendra";
		student.marks = new int[4];
		student.marks[0] = 90;
		student.marks[1] = 65;
		student.marks[2] = 59;
		student.marks[3] = 85;
		student.email = "surendraa.2017@gmail.com";
		student.collegeName = "VREC";
		student.mobileNumber = "7358456712";

		
		System.out.println("---");
		student.displayStudents();

		student.totalMarks();

		Utility.sendEmail(email, student.email);
		
		Utility.sendSMS(mobileNumber, student.mobileNumber);
		
		

	}

}
