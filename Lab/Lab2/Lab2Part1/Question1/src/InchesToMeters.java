import java.util.Scanner;
public class InchesToMeters {

	public static void main(String[] Strings) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a value for inches: ");
		double inche = input.nextDouble();
		double meters = inche * 0.0254;
		System.out.println(inche + " inches is "+ meters + "meters");
		input.close();
		
	}

}
