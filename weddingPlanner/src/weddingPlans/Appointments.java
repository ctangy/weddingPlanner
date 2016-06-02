package weddingPlans;

import java.util.ArrayList;

public class Appointments implements Budget{

	double cost;
	
	public static void main(String[] args) {
	
		//1d array of dress options and times
		//person picks a time
		//check if schedule is free
		//add to time on schedule
		//adjust budget
	}
	
	public static void welcome() {
		int budget = Main.returnBudget();
		
		//ArrayList<Appointments> possibleAppointments = new ArrayList<Appointments>();
		//possibleAppointments.add(new Appointments());
		
		System.out.println("Hello, welcome to Appointment-Maker. " +
				"Your budget is $" + budget);
		
		dressAndTimes();
	}
	
	
	public static void dressAndTimes() {
		String[] dresses; 
		dresses = new String[]{"Badgley Mischka", "Carolina Herrera", "Claire Pettibone", "Amanda Wyatt", "Caroline Castigliano"};
		
		int[] times;
		times = new int[]{5, 2, 5, 4, 6};
		
		String temp = "";
		int option = 1;
		
		for (int i = 0;(i < dresses.length && i < times.length); i++) {
			temp += "Press " + option + " for an appointment with " + dresses[i] + " at " + times[i] + " .\n";
			option++;
		}
		
		System.out.println(temp);
	}

		//IMPLEMENTED METHODS

	public void canAfford(double price) {
		// TODO Auto-generated method stub
		
	}

	public boolean calculatePrice(int x, int budget) {
		// TODO Auto-generated method stub
		return false;
	}
		
	//getcost -- budget.
	//are u done or do u wanna get invitations or adjust budget
	
}
