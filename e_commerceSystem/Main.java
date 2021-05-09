package e_commerceSystem;

import java.util.List;

import e_commerceSystem.business.abstracts.UserService;
import e_commerceSystem.business.concretes.GoogleUserServiceImpl;
import e_commerceSystem.business.concretes.UserManager;
import e_commerceSystem.business.concretes.ValidationManager;
import e_commerceSystem.dataAccess.abstracts.UserDao;
import e_commerceSystem.dataAccess.concretes.UserDaoManagement;
import e_commerceSystem.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("\n---------------------Register-------------------------------");
		
		
		UserService userService = new UserManager(new UserDaoManagement(), new ValidationManager(new UserDaoManagement()));
		
		User user1 = new User(1, "Busra", "Korkut", "korkut@gmail", "123456");
		User user2 = new User(2, "Busra", "Korkut", "korkut@gmail", "123456");
		User user3 = new User(3, "gizem", "altunbas", "altunbas@gmail", "456789");
		
		User user4 = new User(4, "sude", "altun", "sude@gmail", "20202020");
		
		User[] users = {user1, user2, user3};
		
		for(User user : users) {
			userService.Register(user);
		}
		
		
		System.out.println("\n---------------------Login-----------------------------------");

		String email1 = "korkut@gmail";
		String password1 = "525252";
		userService.Login(email1, password1);
		
		String email2 = "korkut@gmail";
		String password2 = "123456";
		userService.Login(email2, password2);
		
		
		UserService googleUserService = new GoogleUserServiceImpl(new UserDaoManagement());
		googleUserService.Register(user4);
		googleUserService.Login(user4.getEmail(), user4.getPassword());
		
		
		
		
		

	}

}
