package info.ReturningMultipleObjectsaAndObjectType;

//Objectfactory class
//where i need to return Student and master objects
public class ObjectsFactory {

	public AggregateStudentAndMaster getAllTypeOfUsers() {

		Student student = new Student();
		student.setId(24);
		student.setName("alaparthi");

		Master master = new Master();
		master.setId(12);
		master.setName("surendra");

		AggregateStudentAndMaster ag = new AggregateStudentAndMaster();

		ag.setStudent(student);
		ag.setMaster(master);
		return ag;

	}
	
	//Instead of object If I put master i can return only master object
	//return either master or student i can use Object as return type
	public Object getUserByType(int userTpye) {
		Object obj = null;
		if (userTpye == 1) {
			Master master = new Master();
			master.setId(100);
			master.setName("india");
			obj = master;
		} else if (userTpye == 2) {
			Student student = new Student();
			student.setId(200);
			student.setName("indian");
			obj = student;
		}
		return obj;

	}

}
