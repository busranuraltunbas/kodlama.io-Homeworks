package e_commerceSystem.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import e_commerceSystem.business.abstracts.ValidationService;
import e_commerceSystem.dataAccess.abstracts.UserDao;
import e_commerceSystem.entities.concretes.User;

public class ValidationManager implements ValidationService{
	
	private UserDao userDao;
	
	public ValidationManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean validate(User user) {
		if(rules(user) & isRegestered(user)) {
			System.out.println("Verification mail has been sent to :" + user.getEmail());
			System.out.println("User approved the verification e-mail");
			userDao.getUsers().add(user);
			return true;
		}
		return false;
	}

	@Override
	public boolean login(String mail, String password) {
		for(User myUser : userDao.getUsers()) {
			if(myUser.getEmail().equals(mail) & myUser.getPassword().equals(password)) {
				return true;
			}			
		}
		return false;
	}
	
	private boolean isInvalidPassword(String password) {
		if(password.length()<6){
			System.out.println("The password must be at least 6 characters! :");
			return false;
		}
		return true;
	}
	
	
	private boolean isValidFirstName(String firstName) {
		if(firstName.length()<2) {
			System.out.println("The name must be at least 2 characters!");
			return false;
		}
		return true;
	}
	
	private boolean isValidSecondName(String secondName) {
		if(secondName.length()<2) {
			System.out.println("The name must be at least 2 characters!");
			return false;
		}
		return true;
	}
	
	private boolean isRegestered(User user) {
		for(User myUser : userDao.getUsers()) {
			if(myUser.getEmail().equals(user.getEmail())) {
				System.out.println("The email address is already registered in the system! " + user.getEmail());
				return false;
			}			
		}
		return true;
	}
	
	private boolean isValidEmail(String email) {
		 String regex = "^(.+)@(.+)$";
		 Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(email);
		 if(!matcher.matches()) {
			 System.out.println("Email format is invalid!");
			 return false;
		 }
		 return true;
	}
	
	private boolean rules(User user) {
		if(isValidFirstName(user.getFirstName()) & isValidSecondName(user.getLastName()) & 
				isValidEmail(user.getEmail()) & isInvalidPassword(user.getPassword())) {
				return true;
		}
		return false;
	}

}
