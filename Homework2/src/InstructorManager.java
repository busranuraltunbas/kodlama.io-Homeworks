
public class InstructorManager extends UserManager{

	@Override
	public void addUser(User user) {
		System.out.println("Instructor Manager  Tarafindan Instructor Eklendi");
		//super.addUser(user);
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("Instructor Manager Tarafindan Instructor Silindi");
		//super.deleteUser(user);
	}
	
	@Override
	public void listUser(User[] user) {
		for (User user2 : user) {
			System.out.println(user2.getId() + " " + user2.getFirstName() + " "+ user2.getSecondName() + " "  + user2.getEmail());
		}
		
	}
	
	
	
}
