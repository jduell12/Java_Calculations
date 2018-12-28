
import java.util.*;

public class RoomArea {

	public static void main(String[] args) {
		// creates variables
		int len = 0, width = 0;
		double areaFt, areaM;

		// creates a scanner class
		Scanner scan = new Scanner(System.in);

		// prompts user for length of room in feet
		System.out.println("Enter the length of the room in feet: ");
		try {
			len = scan.nextInt();
		} catch (Exception e) {
			System.out.println("Error: need to input a number not a letter or symbol");
			System.exit(0);
		}

		// prompts user for width of room in feet
		System.out.println("Enter the width of the room in feet: ");
		try {
			width = scan.nextInt();
		} catch (Exception e) {
			System.out.println("Error: need to input a number not a letter or symbol");
			System.exit(0);
		}

		// lets user know what dimensions they used
		System.out.println("You entered the dimensions " + len + " feet by " + width + " feet. ");

		// finds the area in square feet
		areaFt = len * width;

		// finds the area in square meters
		areaM = areaFt * 0.09290304;

		// lets the user know what the area is in square feet and square meters
		System.out.println("The area is " + areaFt + " square feet and " + areaM + " square meters.");

		// closes scan class
		scan.close();

	}

}
