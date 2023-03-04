
public class AirConditioner {

	private boolean powerOn; // Private instance variable which decide the power
	private int mode; 		 // Private instance variable which decide the work mode
	private int temperature; // Private instance variable which decide the temperature

	public AirConditioner() { // Public constructor and initialize the instance variables
		powerOn = false;
		mode = 0;
		temperature = 16;
	}

	public void turnOn() { // Turn on the power
		powerOn = true;
	}

	public void turnOff() { // Turn off the power
		powerOn = false;
	}

	public boolean getPower() { // Return the power status
		return powerOn;
	}

	public void setMode(int mode) { // Set the work mode.
		if (powerOn == false) { 	// Check the power status
			System.out.println("Please turn on the AC first");
		} else if (mode > 2 || mode < 0) {// Check the input value which is invalid or not
			System.out.println("Invalid mode");
		} else { 					// Change the work mode
			this.mode = mode;
		}
	}

	public int getMode() { // Return the work mode value
		return mode;
	}

	public void setTemperature(int temp) {  // Set the temperature
		if (powerOn == false) { 			// Check the power status
			System.out.println("Please turn on the AC first");
		} else if (mode == 3) { 			// Check the work mode is valid
			System.out.print("Cannot set the temperature in the dry mode");
		} else if (temp > 30 || temp < 16) { // Check the input value which is invalid or not
			System.out.print("Invalid temperature");
		} else { 							// Change the temperature
			this.temperature = temp;
		}

	}

	public int getTemperature() { // Return the temperature value
		return temperature;
	}

	public static void testAirConditioner() {
		AirConditioner ac = new AirConditioner();
		// test the constructor
		System.out.println(ac.getPower() == false);
		System.out.println(ac.getMode() == 0);
		System.out.println(ac.getTemperature() == 16);
		// test the power functions
		ac.turnOn();
		System.out.println(ac.getPower() == true);
		ac.turnOff();
		System.out.println(ac.getPower() == false);
		// test the mode functions
		ac.setMode(1);
		System.out.println(ac.getMode() == 0);
		ac.turnOn();
		ac.setMode(5);
		System.out.println(ac.getMode() == 0);
		ac.setMode(2);
		System.out.println(ac.getMode() == 2);
		// test the temperature functions
		ac.turnOff();
		ac.setTemperature(20);
		System.out.println(ac.getTemperature() == 16);
		ac.turnOn();
		ac.setTemperature(20);
		System.out.println(ac.getTemperature() == 16);
		ac.setMode(1);
		ac.setTemperature(31);
		System.out.println(ac.getTemperature() == 16);
		ac.setTemperature(20);
		System.out.println(ac.getTemperature() == 20);

	}
}
