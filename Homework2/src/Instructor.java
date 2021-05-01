
public class Instructor extends User{
	
	
	private int instructorId;
	private String firstName;
	private String secondName;
	private String[] courses;
	
	public Instructor(int instructorId, String firstName, String secondName, String email) {
		this.setId(instructorId);
		this.firstName = firstName;
		this.secondName = secondName;
		this.setEmail(email);
	}
	
	
	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	
	
	
	
	
	

}
