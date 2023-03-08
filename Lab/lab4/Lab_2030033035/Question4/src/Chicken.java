public class Chicken {
	private double weight; // Private double instance variable weight.
	private boolean sleeping = true; // Private instance variable sleeping and is initialized in sleeping.

	public Chicken(double weight) {
		// A constructor that takes as argument an weight number whose data type is
		// double.
		if (weight < 0) {
			this.weight = 0;
		} else {
			this.weight = weight;
		}
	}

	public double getWeight() {
		// A method that get the chicken weight.
		return weight;
	}

	public boolean isSleeping() {
		// A method that whether the chicken is sleeping.
		return sleeping;
	}

	public void fallAsleep() {
		// A method that make the chicken fall in sleep if he or she is awake.
		if (sleeping == false) {
			sleeping = true;
		}
		// Do nothing if he or she is sleeping.
		else {
			return;
		}
	}

	public void wakeUp() {
		// A method when the chicken wake up, change his sleeping status.
		if (sleeping = true) {
			sleeping = false;
		} else {
			return;
		}
	}

	public static void testChicken() {
		Chicken c = new Chicken(2.3);
		System.out.println(c.getWeight() == 2.3);
		System.out.println(c.isSleeping() == true);
		c.wakeUp();
		System.out.println(c.isSleeping() == false);
		c.wakeUp(); // should do nothing because the chicken is already awake
		System.out.println(c.isSleeping() == false);
		c.fallAsleep();
		System.out.println(c.isSleeping() == true);
		c.fallAsleep(); // should do nothing because the chicken is already sleeping
		System.out.println(c.isSleeping() == true);
	}

}
