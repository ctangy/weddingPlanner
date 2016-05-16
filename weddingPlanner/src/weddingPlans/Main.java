package weddingPlans;
import java.util.Scanner;

public class Main {
	static int budget = 0;

	public static void main(String[] args) {
		System.out.println("Hi, Welcome to East Room! We are a wedding planner that guaratnee your\n"+
				"wedding to be fantastic! What is your budget?");
		getBudget();
	}

	public static void getBudget() {
		Scanner scanner = new Scanner(System.in);

		if(!scanner.hasNextInt()) {
			System.out.println("Please enter a number!");
			getBudget();
		} 

		budget = scanner.nextInt();
		System.out.println("So your budget is $" + budget);
		System.out.println("Awesome! What would you like to do today?");
		makeChoice();		
	}

	public static void makeChoice() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please input the number corresponding to the option\n" +
				"1 - Set an Appointment(Venue, Catering, Attire) \n" +
				"2 - Buy Invitations");

		if(!scanner.hasNextInt()) {
			System.out.println("Please enter the valid choice!");
			makeChoice();
		} 

		int choice = scanner.nextInt();

		if (choice == 1) {
			System.out.println(choice);
		} else if (choice == 2) { 
			cardBuying.enterSite();
		} else {
			System.out.println("Please enter the valid choice!");
			makeChoice();
		}
	}

}



