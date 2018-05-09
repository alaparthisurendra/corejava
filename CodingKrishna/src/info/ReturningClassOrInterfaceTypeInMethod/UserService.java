package info.ReturningClassOrInterfaceTypeInMethod;

import java.util.List;

public interface UserService {
	
	public boolean adduser(User user);

	public User getUser(int userId);

	public List<User> getUserList();

}
