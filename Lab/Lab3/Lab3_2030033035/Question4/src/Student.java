public class Student {
	private int ID;			// Private instance variable ID.
	private String name;	// Private instance variable name.
	private char grade = 'A';// Private instance variable grade and is initialized in 'A'.

	public Student(int ID, String name) {
		// A constructor that takes as argument an ID number whose data type is integer 
		// and a student name whose data type is string.
		// If ID is negative, it will be set in 0.
		if (ID < 0) {
			this.ID = 0;
		} else {
			this.ID = ID;
		}
		this.name = name;
	}
	
	public int getID() {
		//A method that get the student ID.
		return ID;
	}

	public String getName() {
		//A method that get the student name.
		return name;
	}

	public void setName(String name) {
		//A method that set the student name.
		this.name = name;
	}
	
	public char getGrade() {
		//A method that get the student's grade.
		return grade;
	}

	public void setGrade(char Grade) {
		//A method that set the student's grade.
		this.grade = Grade;
	}

	public static void testStudent() {
		// Testing the constructor and the getID method
		Student s1 = new Student(9999999, "Philippe");
		System.out.println(s1.getID() == 9999999);
		// Testing the getName and setName methods
		System.out.println(s1.getName() == "Philippe");
		s1.setName("Meunier");
		System.out.println(s1.getName() == "Meunier");
		// Testing the getGrade and setGrade methods
		System.out.println(s1.getGrade() == 'A');
		s1.setGrade('F');
		System.out.println(s1.getGrade() == 'F');
		// Testing the 'if' test in the constructor
		Student s2 = new Student(-9999999, "Unknown");
		System.out.println(s2.getID() == 0);
		Student s3 = new Student(0, "Unknown");
		System.out.println(s3.getID() == 0);
	}
}