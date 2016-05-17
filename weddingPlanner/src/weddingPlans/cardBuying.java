package weddingPlans;

import java.util.ArrayList;
import java.util.Scanner;

public class cardBuying implements InvitClient {
	int numCards;
	 //NEMRACCards ic = NEMRACCards.getInstance(this);
	static Scanner scan = new Scanner(System.in);
	static String location;
	String date;
	String time;
	String[] guests;

	public static void enterSite() {
		
		System.out.println("Hi, Welcome to NEMRACCards!\n"+
				"Our cards are the best\n"+
				"No one can contest!\n");
		
		System.out.println("First off, I would like for you to input all necessary information\n"+
						"needed to create your invitation.\n");
		
		System.out.println("Enter the location");
			location = scan.nextLine();
			if(location == null){
				System.out.println("Blank input, try again");
				location = scan.nextLine();
			}else{  
				System.out.println("Your location is " + location);
			}
		
	}

	public int getQuantity(boolean print) {
		if(!print){
			numCards = scan.nextInt();
			System.out.println("Please input the amount of Invitation Cards you would like to purchase.\n"+
					"We only accept multiple of 5's.");

			if(!scan.hasNextInt()) {
				System.out.println("Sorry, we only accept numbers.");
				getQuantity(print);
			} 
			
			if(numCards % 5 != 0){
				System.out.println("Sorry, we only accept multiples of 5's");
				getQuantity(print);
			}
		}
		return numCards;
	}

	public int getDesign() {
		// TODO Auto-generated method stub
		return 0;
	}

	public ArrayList<String> getNames() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<String> getGeneralInformation() {
		
		return null;
	}
	



}
