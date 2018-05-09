package info.ReturningClassOrInterfaceTypeInMethod;

import java.util.ArrayList;
import java.util.List;

public class AppTest {
	// return type is premitive
	public int getNumber() {
		return 12;
	}

	// return type is class type
	// return type is Object type we want to return particular Object type
	public User getUser() {
		User user = new User();
		/*user.setId(1000);
		user.setName("alaparthi");*/
		return user;
	}

	// return type is type of Interface
	// return type is Interface here i am returning implementated Object
	// If it is a Interface you can return any implementation class Object
	public List<User> getUserList() {

		List<User> userlist = new ArrayList<>();

		User user1 = new User();
		user1.setId(500);
		user1.setName("chowdary");

		User user2 = new User();
		user2.setId(600);
		user2.setName("Nizamabad");

		userlist.add(user1);
		userlist.add(user2);

		return userlist;

	}

	public static void main(String[] args) {
		AppTest appTest = new AppTest();
		int number = appTest.getNumber();
		User user = appTest.getUser();
		List<User> userList = appTest.getUserList();
		
		System.out.println(number);
		System.out.println(user);
		//System.out.println(userList);
		System.out.println("UserList:");
		for (User u : userList) {
			System.out.println(u);
		}
		
		//getUserService is a static method.call through class Name
		//Return type is Interface(UserService) taken interface reference.
		UserService userService = UserServiceImplentation.getUserService();
		// add multiple users
		User user2 = new User();
		user2.setId(1);
		user2.setName("India");
		
		User user3 = new User();
		user3.setId(2);
		user3.setName("SouthAfrica");
		
		User user4 = new User();
		user4.setId(3);
		user4.setName("Australia");
       
		//add users
		userService.adduser(user4);
		userService.adduser(user3);
		userService.adduser(user2);
		userService.adduser(user);
		
		//get the user
		//In this case it returns object
		User us = userService.getUser(3);
		System.out.println("user from UserService:"+us);
		 
		
		// you want all users
		// In this case it returns List(Interface)
		//mostly used in projects
		List<User> userListFromService = userService.getUserList();
		System.out.println("userListFromService:"+userListFromService);
		
		System.out.println(".....iterate One By One User....");
		
		//iterate One By One User
	    for (User use : userListFromService) {
			System.out.println(use);
		}
	}

}
