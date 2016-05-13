package weddingPlans;

import java.util.ArrayList;
import java.util.Scanner;

public class cardBuying implements InvitClient {
	int numCards;
	//NEMRACCards ic = NEMRACCards.getInstance(this);
	Scanner scanner = new Scanner(System.in);


	public static void enterSite() {
		System.out.println("Hi, Welcome to NEMRACCards!\n"+
				"Our cards are the best"+
				"No one can contest!");
		
		System.out.println("First off, I would like for you to input all necessary information\n"+
						"needed to create your invitation.");
		
	}

	public int getQuantity(boolean print) {
		if(!print){
			numCards = scanner.nextInt();
			System.out.println("Please input the amount of Invitation Cards you would like to purchase.\n"+
					"We only accept multiple of 5's.");

			if(!scanner.hasNextInt()) {
				System.out.println("Please follow the directions above.");
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
