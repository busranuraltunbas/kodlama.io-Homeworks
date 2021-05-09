package e_commerceSystem.dataAccess.abstracts;

import java.util.List;

import e_commerceSystem.entities.concretes.User;

public interface UserDao {
	void login(User user);
	void register(User user);
	List<User> getUsers();
}
