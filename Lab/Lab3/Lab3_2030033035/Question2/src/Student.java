public class Student {
	private int ID;// Private instance variable ID

	public Student(int ID) {
		// A constructor that takes as argument an ID number.
		// If ID is negative, it will be set in 0.
		if (ID < 0) {
			this.ID = 0;
		} else {
			this.ID = ID;
		}

	}

	public int getID() {
		//A method that get the student ID.
		return ID;
	}

	public static void testStudent() {
		// Testing the constructor and the getID method 
		Student s1 = new Student(9999999); 
		System.out.println(s1.getID() == 9999999);
		// Testing the 'if' test in the constructor
		Student s2 = new Student(-9999999);
		System.out.println(s2.getID() == 0);
		Student s3 = new Student(0);
		System.out.println(s3.getID() == 0);
	}
}