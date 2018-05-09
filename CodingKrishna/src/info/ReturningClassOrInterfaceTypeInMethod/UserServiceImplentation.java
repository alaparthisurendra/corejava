package info.ReturningClassOrInterfaceTypeInMethod;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImplentation implements UserService {

	private List<User> userList = new ArrayList<>();

	//Here return type is Interface(UserService) thus why returning
	//implemtation class object(UserServiceImplemtation)
	public static UserService getUserService() {
		return new UserServiceImplentation();

	}

	@Override
	public boolean adduser(User user) {
		return userList.add(user);
	}

	@Override
	public User getUser(int userId) {
		User user=null;
		for(User u: userList)
		{
			if(u.getId()==userId)
			{
				user=u;
			}
		}
		return user;
	}

	@Override
	public List<User> getUserList() {
		return userList;
	}

}
