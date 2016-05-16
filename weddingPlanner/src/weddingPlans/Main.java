package weddingPlans;
import java.util.Scanner;

public class Main {
	static int budget = 0;
	private static int count = 5;
	static int choice;

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
		if(budget > 0){
		System.out.println("So your budget is $" + budget);
		System.out.println("Awesome! What would you like to do today?");
		makeChoice();		
		}
		if(budget < 0){
			System.out.println("Invalid input.");
			getBudget();
		}
//		if(budget == 0){
//			System.out.println("Blank input.");
//			getBudget();
//		} needs to put an if for empty int inputs.
	}
	public static void makeChoice() {
		while(count > 0){
			Scanner scanner = new Scanner(System.in);

			System.out.println("Please input the number corresponding to the option\n" +
					"1 - Set an Appointment(Venue, Catering, Attire) \n" +
					"2 - Buy Invitations");

			if(!scanner.hasNextInt()) {
				count --;
				if(count == 0){
					break;
				}
				System.out.println("Please enter a valid choice!");
				makeChoice();

				choice = scanner.nextInt();
				
				if (choice == 1) {
					System.out.println(choice);
				}
				if (choice == 2) { 
					cardBuying.enterSite();
				}

			} 
		}
		if(count == 0){
			System.out.println("Sorry, we do not tolerate spam\n"+
					"please restart the program.\n"+
					"We will now restart the program.");
			main(null);
			count = 5;
		}
	}	

}
