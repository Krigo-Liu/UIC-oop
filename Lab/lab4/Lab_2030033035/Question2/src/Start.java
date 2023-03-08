public class Start {
	public static void main(String[] args) {
		// Test that the Student class is correct.
		Student.testStudent();
		Student s = new Student(1); // Call a new object Student.
		String answer = Start.check(s); // Get the check method result.
		// Start start = new Start();String answer = start.check(s);
		System.out.println(answer == "need coffee"); // Student is awake in default, so he should need coffee
		s.fallAsleep(); // Let student sleep.
		answer = Start.check(s); // Get the check method result.
		// answer = start.check(s);
		System.out.println(answer == "sweet dreams");// Student is sleeping, so he should have a sweet dreams.
	}

	// If we want use check methond in "Start.check(s1)" , "static" should be used.
	// If we want use check methond in "Start start = new Start();start.check(s);", "static" can not be used.
	public static String check(Student s1) { // public String check(Student s1) {
		if (s1.isSleeping() == true) { // If the student is sleeping.
			String result = "sweet dreams";
			return result;
		} else { // If the student is awake.
			String result = "need coffee";
			return result;
		}

	}
}
