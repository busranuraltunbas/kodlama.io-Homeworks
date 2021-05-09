package e_commerceSystem.business.concretes;

import e_commerceSystem.business.abstracts.UserService;
import e_commerceSystem.business.abstracts.ValidationService;
import e_commerceSystem.dataAccess.abstracts.UserDao;
import e_commerceSystem.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private ValidationService validationService;
	
	
	public UserManager(UserDao userDao,  ValidationService validationService) {
		
		this.userDao = userDao;
		this.validationService = validationService;
	}

	@Override
	public void Register(User user) {
		if(validationService.validate(user)) {
			userDao.register(user);
		}
		
	}

	@Override
	public void Login(String email, String password) {
		if(validationService.login(email, password)) {
			System.out.println("Login to the system : " + email);
		}
		else {
			System.out.println("Could not login to the system. Try again!");
		}
	}

}
