package weddingPlans;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class cardBuying implements InvitClient {
	private int numCards;
	Scanner scan = new Scanner(System.in);
	DateFormat format = new SimpleDateFormat("MM-dd-yyyy");
	Date today = new Date();
	private String location;
	private String date;
	Calendar dow = Calendar.getInstance();
	//private String month;
	//private String day;
	//private String year;
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

	public void inputLocTime(boolean locFirst){
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
					System.out.println("Input the date in the format (MM/DD/YYYY");
					System.out.println("For example, it is now " + format.format(new Date()));
					Date date = null;
					while (date == null) {
					    String line = scan.nextLine();
					    try {
					        date = format.parse(line);
					        if(today.compareTo(date)<0){
					        	System.out.println(date);
					        	
					        }
					    } catch (ParseException e) {
					        System.out.println("Sorry, that's not valid. Please try again.");
					    }
					}
					
		
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
		return null;
		// TODO Auto-generated method stub

	}




}