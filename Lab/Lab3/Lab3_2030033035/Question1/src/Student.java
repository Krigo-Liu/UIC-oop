public class Student {
	private int ID; // Private instance variable ID

	public Student(int ID) { 
		this.ID = ID;
		//A constructor that takes as argument an ID number and do nothing.
	}

	public int getID() { 
		//A method that get the student ID.
		return ID;
	}

	public static void testStudent() {
		// Testing the constructor and the getID method
		Student s = new Student(9999999);
		System.out.println(s.getID() == 9999999);
	}
}