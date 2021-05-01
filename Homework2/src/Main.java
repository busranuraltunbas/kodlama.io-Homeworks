
public class Main {

	public static void main(String[] args) {
		
		String[] courses = new String[] {"Veri yapilari", "Programlama", "Yapay Zeka"}; 
		
		Student student1 = new Student(1, "Busra", "Korkut", "korkutbusra");
		Instructor instructor1 = new Instructor(1, "Elham", "Hoca","hocaelham");
		
		Student[] students =  new Student[] {student1};
		Instructor[] instructors = new Instructor[] {instructor1};
		
		StudentManager studentManager =  new StudentManager();
		studentManager.addUser(student1);
		
		InstructorManager instructorManager =  new InstructorManager();
		instructorManager.addUser(instructor1);
		
		
		studentManager.listUser(instructors);
		instructorManager.listUser(students);
		

	}

}
