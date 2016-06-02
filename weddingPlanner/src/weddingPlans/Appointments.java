package weddingPlans;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Appointments implements Budget{

	public static void main(String[] args) {

		//1d array of dress options and times
		//person picks a time
		//check if schedule is free
		//add to time on schedule
		//adjust budget
	}

	String print;
	static String currentMonth;
	static int budget = Main.returnBudget();
	int month;
	static int appointmentPrice = 0;

	public Appointments() {
		welcome();
	}

	//greet audience
	//return budget
	public void welcome() {		
		System.out.println("Hello, welcome to Appointment-Maker. " +
				"Your budget is $" + budget);

		
		System.out.println("Hello, welcome to Appointment-Maker. "+
					"Your budget is $" + budget);
		
		dressAndTimes();
	}

	//lists dress companies and dates
	public static void dressAndTimes() {
		String[] dresses; 
		dresses = new String[]{"Badgley Mischka", "Carolina Herrera", "Claire Pettibone", "Amanda Wyatt", "Caroline Castigliano"};

		int[] times;
		times = new int[]{30, 20, 25, 12, 6};
		
		int[] prices;
		prices = new int[]{200,341,234,14,33};
		String temp = "";
		int option = 1;

		for (int i = 0;(i < dresses.length && i < times.length); i++) {
			temp += "Press " + option + " for an appointment with " + dresses[i] + " on the " 
					+ times[i] + "th" + " for $" + prices[i] + ".\n";
		
			option++;
		}

		System.out.println(temp);

		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();

		if (choice == 1) {
			placeAppointment(1);
			appointmentPrice = prices[0]; 
		}
		if (choice == 2) {
			placeAppointment(2);
			appointmentPrice = prices[1]; 
		} if (choice == 3) {
			placeAppointment(3);
			appointmentPrice = prices[2]; 
		} if (choice == 4) {
			placeAppointment(4);
			appointmentPrice = prices[3];
		} if (choice == 5) {
			placeAppointment(5);
			appointmentPrice = prices[4];
		}

	}

	//find out what month it is
	public static void calendar() {
		Calendar now = Calendar.getInstance();
		int month = now.get(Calendar.MONTH) + 1;
		if (month == 1) {
			currentMonth = "January";
		} if (month == 2) {
			currentMonth = "February";
		} if (month == 3) {
			currentMonth = "March";
		} if (month == 4) {
			currentMonth = "April";
		} if (month == 5) {
			currentMonth = "May";
		} if (month == 6) {
			currentMonth = "June";
		} if (month == 7) {
			currentMonth = "July";
		} if (month == 8) {
			currentMonth = "August";
		} if (month == 9) {
			currentMonth = "September";
		} if (month == 10) {
			currentMonth = "October";
		} if (month == 11) {
			currentMonth = "November";
		} if (month == 12) {
			currentMonth = "December";
		}
	}

	
	public static void canAfford(int price) {
		if (price == 1) {
			if (budget > 200) {
				System.out.println("You can afford this appointment. Congrats. Thank you.");
				 System.exit(0);
			} if (budget < 200) {
				System.out.println("Your budget is less than the price for this appointment. You will need to restart the program.");
				 System.exit(0);
			} 
		} if (price == 2) {
			if (budget > 341) {
				System.out.println("You can afford this appointment. Congrats. Thank you.");
				 System.exit(0);
			} if (budget < 341) {
				System.out.println("Your budget is less than the price for this appointment. You will need to restart the program.");
				 System.exit(0);
			} 			
		} if (price == 3) {
			if (budget > 234) {
				System.out.println("You can afford this appointment. Congrats. Thank you.");
				 System.exit(0);
			} if (budget < 234) {
				System.out.println("Your budget is less than the price for this appointment. You will need to restart the program.");
				 System.exit(0);
			} 
		} if (price == 4) {
			if (budget > 14) {
				System.out.println("You can afford this appointment. Congrats. Thank you.");
				 System.exit(0);
			} if (budget < 14) {
				System.out.println("Your budget is less than the price for this appointment. You will need to restart the program.");
				 System.exit(0);
			} 
		} if (price == 5) {
			if (budget > 33) {
				System.out.println("You can afford this appointment. Congrats. Thank you.");
				 System.exit(0);
			} if (budget < 33) {
				System.out.println("Your budget is less than the price for this appointment. You will need to restart the program.");
				 System.exit(0);
			} 
		}
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

	//place appointment at certain date
	public static void placeAppointment(int here) {
		System.out.println("This is your schedule from before."); 
		calendarShow();
		System.out.println("This is your current schedule after this appointment.");

		if (here == 1) {
			String[] fifth = new String[]{"[]", "[]", "[]", "[]", "[X]", "  ", "  "}; 

			String[] first = new String[]{"  ", "  ", "  ", "[]", "[]", "[]", "[]"}; 
			String[] second = new String[]{"[]", "[]", "[]", "[]", "[]", "[]", "[]"}; 
			String[] third = new String[]{"[]", "[]", "[]", "[]", "[]", "[]", "[]"}; 
			String[] fourth = new String[]{"[]", "[]", "[]", "[]", "[]", "[]", "[]"}; 

			System.out.println(Arrays.toString(first));
			System.out.println(Arrays.toString(second));
			System.out.println(Arrays.toString(third));
			System.out.println(Arrays.toString(fourth));
			System.out.println(Arrays.toString(fifth));
			
			canAfford(1);
		}
		if (here == 2) {
			String[] fourth = new String[]{"[]", "[X]", "[]", "[]", "[]", "[]", "[]"}; 

			String[] first = new String[]{"  ", "  ", "  ", "[]", "[]", "[]", "[]"}; 
			String[] second = new String[]{"[]", "[]", "[]", "[]", "[]", "[]", "[]"}; 
			String[] third = new String[]{"[]", "[]", "[]", "[]", "[]", "[]", "[]"}; 
			String[] fifth = new String[]{"[]", "[]", "[]", "[]", "[]", "  ", "  "}; 

			System.out.println(Arrays.toString(first));
			System.out.println(Arrays.toString(second));
			System.out.println(Arrays.toString(third));
			System.out.println(Arrays.toString(fourth));
			System.out.println(Arrays.toString(fifth));
			
			canAfford(2);
		}if (here == 3) {
			String[] fourth = new String[]{"[]", "[]", "[]", "[]", "[]", "[]", "[X]"}; 
			String[] first = new String[]{"  ", "  ", "  ", "[]", "[]", "[]", "[]"}; 
			String[] second = new String[]{"[]", "[]", "[]", "[]", "[]", "[]", "[]"}; 
			String[] third = new String[]{"[]", "[]", "[]", "[]", "[]", "[]", "[]"}; 
			String[] fifth = new String[]{"[]", "[]", "[]", "[]", "[]", "  ", "  "}; 

			System.out.println(Arrays.toString(first));
			System.out.println(Arrays.toString(second));
			System.out.println(Arrays.toString(third));
			System.out.println(Arrays.toString(fourth));
			System.out.println(Arrays.toString(fifth));
			
			canAfford(3);
		}if (here == 4) {
			String[] third = new String[]{"[X]", "[]", "[]", "[]", "[]", "[]", "[]"}; 
			String[] first = new String[]{"  ", "  ", "  ", "[]", "[]", "[]", "[]"}; 
			String[] second = new String[]{"[]", "[]", "[]", "[]", "[]", "[]", "[]"}; 
			String[] fourth = new String[]{"[]", "[]", "[]", "[]", "[]", "[]", "[]"}; 
			String[] fifth = new String[]{"[]", "[]", "[]", "[]", "[]", "  ", "  "}; 

			System.out.println(Arrays.toString(first));
			System.out.println(Arrays.toString(second));
			System.out.println(Arrays.toString(third));
			System.out.println(Arrays.toString(fourth));
			System.out.println(Arrays.toString(fifth));
			
			canAfford(4);
		}if (here == 5) {
			String[] second = new String[]{"[]", "[X]", "[]", "[]", "[]", "[]", "[]"}; 
			String[] first = new String[]{"  ", "  ", "  ", "[]", "[]", "[]", "[]"}; 
			String[] third = new String[]{"[]", "[]", "[]", "[]", "[]", "[]", "[]"}; 
			String[] fourth = new String[]{"[]", "[]", "[]", "[]", "[]", "[]", "[]"}; 
			String[] fifth = new String[]{"[]", "[]", "[]", "[]", "[]", "  ", "  "}; 

			System.out.println(Arrays.toString(first));
			System.out.println(Arrays.toString(second));
			System.out.println(Arrays.toString(third));
			System.out.println(Arrays.toString(fourth));
			System.out.println(Arrays.toString(fifth));
			
			canAfford(5);
		}
	}

	public static void calendarShow() {
		String[] first = new String[]{"  ", "  ", "  ", "[]", "[]", "[]", "[]"}; 
		String[] second = new String[]{"[]", "[]", "[]", "[]", "[]", "[]", "[]"}; 
		String[] third = new String[]{"[]", "[]", "[]", "[]", "[]", "[]", "[]"}; 
		String[] fourth = new String[]{"[]", "[]", "[]", "[]", "[]", "[]", "[]"}; 
		String[] fifth = new String[]{"[]", "[]", "[]", "[]", "[]", "  ", "  "}; 

		System.out.println(Arrays.toString(first));
		System.out.println(Arrays.toString(second));
		System.out.println(Arrays.toString(third));
		System.out.println(Arrays.toString(fourth));
		System.out.println(Arrays.toString(fifth));

	}


}