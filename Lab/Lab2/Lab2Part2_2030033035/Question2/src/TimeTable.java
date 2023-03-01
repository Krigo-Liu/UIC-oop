
public class TimeTable {

	public static void main(String[] args) {
		// The first tow line
		System.out.println("* |  1  2  3  4  5  6  7  8  9");
		System.out.println("------------------------------");
		// Two for-loop
		for(int i = 1;i<=9;i++) {
			System.out.print(i+" |");			 // Print the rows.
			for(int j = 1; j<=9;j++) {			 // Define the columns.
 				int mul = i*j;					 // Calculate the content.
				if(mul < 10) {
					System.out.print("  "+mul);  // Print in same space
				}
				else {
					System.out.print(" "+mul);
				}
			}
			System.out.print(" \n"); // One row print finished.
		}
	}

}
