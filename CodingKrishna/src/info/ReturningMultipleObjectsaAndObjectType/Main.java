package info.ReturningMultipleObjectsaAndObjectType;

public class Main {

	public static void main(String[] args) {
		ObjectsFactory objectsFactory = new ObjectsFactory();
		AggregateStudentAndMaster allTypeOfUsers = 
				objectsFactory.getAllTypeOfUsers();
		
		Student student = allTypeOfUsers.getStudent();
		System.out.println(student);
		
		
		Master master = allTypeOfUsers.getMaster();
		System.out.println(master);
		
		System.out.println("=====================");
		
		/*Object object = objectsFactory.getUserByType(2);
		Student ss=(Student)object;*/
		Student ss=(Student)objectsFactory.getUserByType(2);
		System.out.println(ss);

	}

}
