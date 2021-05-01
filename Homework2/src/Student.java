
public class Student extends User{
	
	private String firstName;
	private String secondName;
	
	private int grade;
	
	private String[] courses;
	

	public Student(int studentId, String firstName, String secondName, String email) {
		this.setId(studentId); 
		this.firstName = firstName;
		this.secondName = secondName;
		this.setEmail(email);
	}
	
	public Student(int studentId, String firstName, String secondName, int grade, String[] courses) {

		this.setId(studentId);
		this.firstName = firstName;
		this.secondName = secondName;
		this.grade = grade;
		this.courses = courses;
	}
	
	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
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

	

	
	
}
