package weddingPlans;

import java.util.ArrayList;
import java.util.Scanner;

public class cardBuying implements InvitClient {
	private int numCards;
	static Scanner scan = new Scanner(System.in);
	static String location;
	private String date;
	private String time;
	private String[] guests;
	// boolean locFirst = false;

	public cardBuying(){
		enterSite();
	}
	public void enterSite() {

		System.out.println("Hi, Welcome to NEMRACCards!\n"+
				"Our cards are the best\n"+
				"No one can contest!\n");

				System.out.println("First off, I would like for you to input all necessary information\n"+
				"needed to create your invitation.\n");
				inputLocTime(true);


	}

	public void inputLocTime(boolean locFirst) {
		if(locFirst){
			System.out.println("Enter the location");
					location = scan.nextLine();
					if(location.trim().isEmpty()){
						System.out.println("Blank input, try again");
						inputLocTime(locFirst);
					}else{  
						System.out.println("Your location is " + location); 
								locFirst = false;
					}
		}
		System.out.println("Enter the date");
		date = scan.nextLine();

	}

	public int getQuantity(boolean print) {
		if(!print){
			numCards = scan.nextInt();
			System.out.println("Please input the amount of Invitation Cards you would like to purchase.\n"+
					"We only accept multiple of 5's.");

					if(!scan.hasNextInt()) {
						System.out.println

						("Sorry, we only accept numbers.");
						getQuantity(print);
					} 

					if(numCards % 5 != 0){
						System.out.println

						("Sorry, we only accept multiples of 5's");
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

	public ArrayList<String> 

	getGeneralInformation() {

		return null;
	}


	public String getTime() {
		return date;
		// TODO Auto-generated method stub

	}




}