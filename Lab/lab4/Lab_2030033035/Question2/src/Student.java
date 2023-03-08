public class Student {
	private int ID; // Private instance variable ID.
	private boolean sleeping = false; // Private instance variable sleeping and is initialized in wake.

	public Student(int ID) {
		// A constructor that takes as argument an ID number whose data type is integer
		if (ID < 0) {
			this.ID = 0;
		} else {
			this.ID = ID;
		}
	}

	public int getID() {
		// A method that get the student ID.
		return ID;
	}

	public boolean isSleeping() {
		// A method that whether the student is sleeping.
		return sleeping;
	}

	public void fallAsleep() {
		// A method that make the student fall in sleep if he or she is awake.
		if (sleeping == false) {
			sleeping = true;
		}
		// Do nothing if he or she is sleeping.
		else {
			return;
		}
	}

	public void wakeUp() {
		// A method when the student wake up, change his sleeping status.
		if (sleeping = true) {
			sleeping = false;
		}
		// // Do nothing if he or she is awake.
		else {
			return;
		}
	}

	public static void testStudent() {
		Student s = new Student(1234567890);
		System.out.println(s.getID() == 1234567890);
		System.out.println(s.isSleeping() == false);
		s.fallAsleep();
		System.out.println(s.isSleeping() == true);
		s.fallAsleep(); // should do nothing because the student is already sleeping
		System.out.println(s.isSleeping() == true);
		s.wakeUp();
		System.out.println(s.isSleeping() == false);
		s.wakeUp(); // should do nothing because the student is already awake
		System.out.println(s.isSleeping() == false);
	}
}