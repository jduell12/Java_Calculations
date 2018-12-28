
import java.util.*;

public class PizzaParty {

	public static void main(String[] args) {
		// creates variables
		double people = 0, slice = 0, pizza = 0, medPizza = 8;

		// creates scanner class
		Scanner scan = new Scanner(System.in);

		// prompts user for number of people present
		System.out.println("How many people are present?");
		try {
			people = scan.nextInt();
		} catch (Exception e) {
			System.out.println("Need to input a numeric value. Exiting program.");
			System.exit(0);
		}

		// prompts user for number of slices each person wants
		System.out.println("How many slices does each person want?");
		try {
			slice = scan.nextInt();
		} catch (Exception e) {
			System.out.println("Need to input a numeric value. Exiting program.");
			System.exit(0);
		}

		// calculates how many full pizzas should be purchased
		pizza = people * slice;
		pizza = Math.ceil(pizza / medPizza);
		System.out.println(people + " people and each person wants " + slice + " slices. You should purchase " + pizza
				+ " pizzas.");

		// closes scanner class
		scan.close();

	}

}
