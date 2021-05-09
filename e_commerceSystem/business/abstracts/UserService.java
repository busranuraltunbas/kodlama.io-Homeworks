package e_commerceSystem.business.abstracts;

import e_commerceSystem.entities.concretes.User;

public interface UserService {
	void Register(User user);
	void Login(String email, String password);
}
