package info.UsageOfStaticKeyword;

import java.util.Arrays;

public class Student {
	int id;
	String name;
	int marks[];
	String mobileNumber;
	String email;
	static String collegeName;

	public void displayStudents() {
		System.out.printf("Student[id=" + id + ", name=", name + ", marks=" + Arrays.toString(marks) + ","
				+ " mobileNumber:" + mobileNumber + ", email=" + email + ", CollegeName: " + collegeName);
	}

	public void totalMarks() {
		int total = 0;
		for (int i : marks) {
			total = total + i;
		}
		System.out.println("Total Marks:" + total);

	}

}

