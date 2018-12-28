

import java.util.*;

public class PaintCalc {

	public static void main(String[] args) {
		// constant for gallon of paint to square feet
		final int GALLON_PER_FEET = 350;

		// initializes variables
		double len = 0, width = 0, area = 0, gallon = 0;

		// creates scanner class
		Scanner scan = new Scanner(System.in);

		// prompts user for length and width of room
		System.out.println("Enter the length of the room in feet: ");
		System.out.println("Enter the width of the room in feet: ");
		try {
			len = scan.nextInt();
			width = scan.nextInt();
		} catch (Exception e) {
			System.out.println("User did not enter a numeric value. Exiting program.");
			System.exit(0);
		}

		// finds area of ceiling
		area = len * width;

		// calculates how many gallons are needed and informs user
		gallon = Math.ceil(area / GALLON_PER_FEET);
		System.out.println("For a room with a length of " + len + " feet and a width of " + width
				+ " feet. The area of the ceiling is " + area + " square feet. You need to buy " + gallon
				+ " gallons of paint.");

		// closes scanner class
		scan.close();

	}

}
