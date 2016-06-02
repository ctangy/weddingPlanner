package weddingPlans;

import java.util.ArrayList;
import java.util.Scanner;

public class BudgetTab implements InvitationCompany {

	/**
	 * @param args
	 */
	//Christine
	static int amount; 
	public static int appointmentPrice = 0;
	public static int invitationPrice = 0;//getPrice(InvitClient c);
	static int budget = 0;	
	public static int x = appointmentPrice + invitationPrice;
	static Scanner scanner = new Scanner(System.in);
	static int decision;
	public static boolean affordable = false;
	public static double price = appointmentPrice + invitationPrice;
	
	public BudgetTab(){
		welcome();
	}

	public void welcome(){
		// calculate budget
		//able to take budget and save it
		//if budget is adjusted, needs to save new amount
		// warn whether are not on budget, below budget, above budget
		//make sure customer canAffrod invitations, appointments
		cost();
		pickChoice();
	}
	public static void cost(){
		appointmentPrice = 100;
		invitationPrice = 100;
		x = appointmentPrice + invitationPrice;
	}
	public static void pickChoice(){
		decideChoice();
		choiceMade(decision);
	}
	public static void decideChoice(){
		System.out.println("Welcome to your Budget! Here you can adjust your budget," 
				+" and check whether you are on budget! \n"+
				" Your budget right now is $"+ budget + "! \n"+
						"Enter a number to decide what you would like to do! \n"+
						" 1 - Adjust Budget \n"+
						" 2 - Check Budget \n");
		decision = scanner.nextInt();
	}
	public static int choiceMade(int decision){
		if(decision == 1){
			adjustBudget();
		}
		if(decision == 2){
			calculateBudget(x, budget);
		}
		if( decision == 3){
			Main.main(null);
		}
		return decision;
	}

	public static void calculateBudget(int x, int budget){
		System.out.println( " Your budget is $"+ budget+".");
		if(x == budget){
			System.out.println("You are right on budget, no more, no less!");
		}
		if(budget < x){
			System.out.println("You are below budget! You still have $"+ (x-budget) + " left!" );
		}
		if(budget > x){
			System.out.println("You are above budget! You are over by $" + (budget-x)+"!");
		}
	}

	public static void adjustBudget(){
		int choice = adjustChoice();
		budget += choiceAmount(decision); 

	}
	public static int adjustChoice(){
		System.out.println("You selected to adjust budget! Would you like to increase or decrease your budget?");
		System.out.println("Please input the correct option \n" +
				"1 - Increase \n" +
				"2 - Decrease");
		return decision = scanner.nextInt();
	}
	public static int choiceAmount(int decision){
		String word = "increase";
		int multiplier = 1;

		if(decision== 2){
			word = "decrease";
		}
		System.out.println("You selected to "+word+" budget! Please enter the amount you "+
				"would like to "+word+" it by:(eg. 100,150)");
		if( word == "increase"){
			amount = scanner.nextInt();
			budget = budget+amount;
		}
		if( word != "increase"){
			amount = scanner.nextInt();
			budget = budget-amount;
		}
		System.out.println("Your new budget is now $"+ budget+ "!");
		return multiplier;
	}

	public void canAfford(double price){
		if( price <= budget || price == budget){
			affordable = true;
			System.out.println("You can afford it!");
		}
		affordable =  false;
		System.out.println("You can't afford it!");
	}

	public boolean calculatePrice(int x, int budget) {
		// TODO Auto-generated method stub
		return false;
	}

	public ArrayList<String> getDesignChoices() {
		// TODO Auto-generated method stub
		return null;
	}

	public int[] getpackageSize() {
		// TODO Auto-generated method stub
		return null;
	}

	public NEMRACCards getInstance(InvitClient c) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getQuantity(boolean print) {
		// TODO Auto-generated method stub
		return 0;
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
		// TODO Auto-generated method stub
		return null;
	}

	public void enterSite() {
		// TODO Auto-generated method stub
		
	}

	public void inputLocTime(boolean locFirst) {
		// TODO Auto-generated method stub
		
	}

	public String getTime() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getPrice(InvitClient c) {
		// TODO Auto-generated method stub
		return 0;
	}


}
