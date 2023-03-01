
public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		float count = 0; // Define a "count" for counting.

		// For-loop to calculate the sum and average.
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) { // Determine if the number is divided by 2.
				sum = sum + i;
				count = i;
			} else {
				continue;
			}
		}
		double avg = sum / count; // Calculate the average which should a double data type.
		System.out.print("Calculate the sum and average by for-loop.\n");
		System.out.println("The sum is: " + sum);
		System.out.println("The average is: " + avg);

		// Initialized the parameter.
		sum = 0;
		count = 0;
		int i = 0;

		// While loop to calculate the sum and average.
		while (i <= 10) {
			if (i % 7 == 0) { // Determine if the number divided by 7.
				sum = sum + i;
				count = i;
				i++;
			} else {
				i++;
			}
		}
		count = i - 1;
		avg = sum / count; // Calculate the average which should a double data type.
		System.out.print("Calculate the sum and average by while-loop.\n");
		System.out.println("The sum is: " + sum);
		System.out.println("The average is: " + avg);

		// Initialized the parameter.
		sum = 0;
		count = 0;
		i = 0;

		// Do-while loop to calculate the sum and average.
		do {
			sum = sum + (i * i); // Sum of the squares.
			count = i;
			i++;
		} while (i <= 100);
		count = i - 1;
		avg = sum / count;
		System.out.print("Calculate the sum and average by d0-while loop.\n");
		System.out.println("The sum is: " + sum);
		System.out.println("The average is: " + avg);
	}

}