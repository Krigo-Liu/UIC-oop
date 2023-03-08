public class Start {
	public static void main(String[] args) {
		// Test that the Chicken class is correct.
		Chicken.testChicken();
		Chicken s = new Chicken(1); // Call a new object Chicken.
		String answer = Start.check(s); // Get the check method result.
		// Start start = new Start();String answer = start.check(s);
		System.out.println(answer == "sweet dreams"); // Chicken is sleeping in default, so it should have a sweet dreams.
		s.wakeUp(); // Let Chicken sleep.
		answer = Start.check(s); // Get the check method result.
		// answer = start.check(s);
		System.out.println(answer == "need coffee");// Chicken is awake, so it should need coffee.
	}
	
	// If we want use check method in "Start.check(s1)" , "static" should be used.
	// If we want use check method in "Start start = new Start();start.check(s);", "static" can not be used.
	public static String check(Chicken s1) { // public String check(Chicken s1) {
		if (s1.isSleeping() == true) { // If the Chicken is sleeping.
			String result = "sweet dreams";
			return result;
		} else { // If the Chicken is awake.
			String result = "need coffee";
			return result;
		}

	}
}
