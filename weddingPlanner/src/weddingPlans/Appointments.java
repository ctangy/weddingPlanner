package weddingPlans;

import java.util.ArrayList;

public class Appointments implements SetAppointment{

	double cost;
	
	public static void main(String[] args) {
	
		//1d array of dress options and times
		//person picks a time
		//check if schedule is free
		//add to time on schedule
		//adjust budget
		
		welcome();
	}
	
	public Appointments(){
		cost = 100.00;
	}
	
	

	
	public static void welcome() {
		Budget budget = Main.returnBudget();
		ArrayList<Appointments> possibleAppointments = new ArrayList<Appointments>();
		possibleAppointments.add(new Appointments());
		System.out.println("Hello, welcome to Appointment-Maker. " +
				"Your budget is $" + budget);
	}

	public void setAppointment() {
		// TODO Auto-generated method stub
		
	}
	
	//getcost -- budget.
	//are u done or do u wanna get invitations or adjust budget
	
}
