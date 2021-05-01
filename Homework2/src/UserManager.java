
public class UserManager {
	
	public void addUser(User user) {
		System.out.println("Yönetici Tarafindan Kullanici Eklendi");
	}

	public void deleteUser(User user) {
		System.out.println("Yönetici Tarafindan Kullanici Silindi");
	}
	
	public void listUser(User[] user) {
		for (User user2 : user) {
			System.out.println(user2);
		}
	}
}
