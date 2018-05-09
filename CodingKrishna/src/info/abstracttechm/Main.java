package info.abstracttechm;

class Ten extends Student {

	public Ten() {
		super(true, true);
	}

	@Override
	public void studentInfo() {
		System.out.println("student studing tenth class");

	}

}

class Intermediate extends Student {

	public Intermediate() {
		super(true, false);
	}

	@Override
	public void studentInfo() {
		System.out.println("student studing intermediate");

	}
}

class Btech extends Student {
	public Btech() {
		super(false, false);
	}

	@Override
	public void studentInfo() {
		System.out.println("student studing btech");

	}
}

public class Main extends Student {
	public Main() {
		super(true, true);
	}

	public void studentInfo() {

		System.out.println("studentinfo");
	}

	public static void main(String[] args) {
		Student student = new Ten();
		student.studentInfo();
		student.printdetails();

	}

}
