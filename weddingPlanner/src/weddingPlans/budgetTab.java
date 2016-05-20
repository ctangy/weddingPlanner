package weddingPlans;

import java.util.ArrayList;
import java.util.Scanner;

public class budgetTab implements Budget, InvitClient {

	/**
	 * @param args
	 */
	//Christine
	static int amount; 
	public static int budget = 0;
	public int x = 100;
	static Scanner scanner = new Scanner(System.in);
	static int decision;
	public int appointmentPrice = 0;
	public int invitationPrice = 0;

	public static void welcome(){
		// calculate budget
		//able to take budget and save it
		//if budget is adjusted, needs to save new amount
		// warn whether are not on budget, below budget, above budget
		//make sure customer canAffrod invitations, appointments

	}

	public static void calculateBudget(int x, int budget){
		//for loop?
		if(x == budget){
			System.out.println("You are right on budget!");
		}
		if(budget > x){
			System.out.println("You are below budget! You still have $"+ (budget-x) + " left!" );
		}
		if(budget < x){
			System.out.println("You are above budget! You are over by $" + (x-budget)+"!");
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
			multiplier=-1;
		}
		System.out.println("You selected to "+word+" budget! Please enter the amount you"+
				"would like to "+word+" it by:(eg. 100,150)");

		amount = scanner.nextInt();

		System.out.println("Your new budget is now $"+ budget+ "!");
		return budget+amount*multiplier;
	}

	public boolean canAfford(double price){
		return false;
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

	public int getPrice(InvitClient c) {
		// TODO Auto-generated method stub
		return 0;
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


}