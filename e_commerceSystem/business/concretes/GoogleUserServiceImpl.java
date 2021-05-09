package e_commerceSystem.business.concretes;

import e_commerceSystem.business.abstracts.UserService;
import e_commerceSystem.dataAccess.abstracts.UserDao;
import e_commerceSystem.entities.concretes.User;

public class GoogleUserServiceImpl implements UserService{

	private UserDao userDao;	
	
	public GoogleUserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void Register(User user) {
		
		System.out.println("Google User Register Successful..!");
		userDao.getUsers().add(user);
	}

	@Override
	public void Login(String email, String password) {
		
		for(User myUser : userDao.getUsers()) {
			if(myUser.getEmail().equals(email) & myUser.getPassword().equals(password)) {
				System.out.println(myUser.getFirstName() + myUser.getLastName() + " Login successful from Google...!");
			}	
			else {
				System.out.println("Login unsuccessful from Google...!");
			}
		}
		
		
	}

}
