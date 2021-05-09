package e_commerceSystem.business.abstracts;

import e_commerceSystem.entities.concretes.User;

public interface ValidationService {
	
	boolean validate(User user);

    boolean login(String mail, String password);
}
