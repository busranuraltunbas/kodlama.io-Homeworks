package e_commerceSystem.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import e_commerceSystem.dataAccess.abstracts.UserDao;
import e_commerceSystem.entities.concretes.User;

public class UserDaoManagement implements UserDao{
	
	public List<User> users = new ArrayList<User>();

	@Override
	public void login(User user) {
		System.out.println("Logged in  : " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void register(User user) {
		System.out.println("Regestered to db : " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return users;
	}

}
