package weddingPlans;

import java.util.Scanner;

public class budgetTab {

	/**
	 * @param args
	 */
	//Christine
	static int amount; 
	public static int budget = 300;
	public int x = 100;
	static Scanner scanner = new Scanner(System.in);
	static int decision;
	public static void main(String[] args) {
		// calculate budget
		//able to take budget and save it
		//if budget is adjusted, needs to save new amount
		// warn whether are not on budget, below budget, above budget
		//make sure customer canAffrod invitations, appointments

	}
	
	public static void calculateBudget(int x, int budget){
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
		System.out.println("You selected to adjust budget! Would you like to increase or decrease your budget?");
		System.out.println("Please input the correct option \n" +
				"1 - Increase \n" +
				"2 - Decrease");
		decision = scanner.nextInt();
		if( decision == 1){
			System.out.println("You selected to increase budget! Please enter the amount you"+
					"would to increase it by:(eg. 100,150)");
			amount = scanner.nextInt();
			budget = budget+amount;
			System.out.println("Your new budget is now $"+ budget+ "!");
		}
		if(decision == 2){
			System.out.println("You selected to increase budget! Please enter the amount you"+
					"would like to decrease it by:(eg. 100,150)");
			amount = scanner.nextInt();
			budget = budget-amount;
			System.out.println("Your new budget is now $"+ budget + "!");

		}
	}

	public boolean canAfford(double price){
		return false;
	}
	
	

}