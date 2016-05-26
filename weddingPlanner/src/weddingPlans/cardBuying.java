package weddingPlans;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;
public class cardBuying implements InvitClient {
	private int numCards;
	Scanner scan = new Scanner(System.in);
	DateFormat format = new SimpleDateFormat("MM-dd-yyyy");
	Date today = new Date();
	private int confirm;
	private String groom;
	private String bride;
	private String location;
	private String date;
	//Calendar dow = Calendar.getInstance();
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
				inputWedNames(true);
				conNames(true);
				//inputLocTime(true);
				//need to input time


	}

	
	public void inputWedNames(boolean groomFirst) {
		if(groomFirst){
			System.out.println("What is the groom's name?");
			groom = scan.nextLine();
			if(groom.trim().isEmpty()){
				System.out.println("Invalid input, the groom can't have a blank name.");
				inputLocTime(groomFirst);
				}
			}
			System.out.println("What is the bride's name?");
			bride = scan.nextLine();
			if(bride.trim().isEmpty()){
				System.out.println("Invalid input, the bride can't have a blank name.");
				inputLocTime(false);
				}
			if(bride.equals(groom)){
				System.out.println("Wow, the groom and the bride have the same names!");
			}
		
			
		} 
		
		
	public void conNames(boolean questions) {
		if(questions){
			System.out.println("Please confirm the names inputed are correct.\n"+
					"The groom's name is: "+ groom + 
					"\nThe bride's name is: " + bride +
					"\n1 - Continue "+
					"\n2 - Revise names");
		}
		confirm = scan.nextInt();
		if(!scan.hasNextInt()) {
			System.out.println("Please enter a number!");
			conNames(false);
		}
		if(confirm == 1){
			inputLocTime(true);
		}
		if(confirm == 2){
			inputWedNames(true);
		}
	}
		
		
	
	public void inputLocTime(boolean locFirst){
		if(locFirst){
			System.out.println("Enter the location");
					location = scan.nextLine();
					if(location.trim().isEmpty()){
						System.out.println("Blank input, try again");
						inputLocTime(locFirst);
					}else if(Pattern.matches("[a-zA-Z]+", location)){  
						System.out.println("Your location is " + location); 
								locFirst = false;
					}
					else{System.out.println("Your location can't contain numbers.");
					inputLocTime(true);
					}
			}
					System.out.println("Input the date in the format (MM/DD/YYYY)\n"+
							"We are currently not accepting any dates before 06-04-2016");
					System.out.println("Ex: Today is " + format.format(new Date()));
					Date date = null;
					while (date == null) {
					    String line = scan.nextLine();
					    try {
					        date = format.parse(line);
					        Date limit = format.parse("06-04-2016");
					        if(date.compareTo(limit)<= 0){
					        	System.out.println("Invalid date");
					        	inputLocTime(false);
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