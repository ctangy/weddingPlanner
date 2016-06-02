package weddingPlans;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;
public class cardBuying implements InvitClient, Budget {
	private int numCards;
	Scanner scan = new Scanner(System.in);
	DateFormat format = new SimpleDateFormat("MM-dd-yyyy");
	//Date today = new Date();
	private int confirm;
	private String groom;
	private String bride;
	private String location;
	private String date;
	private String time;
	private String[] guests;
	ArrayList info = new ArrayList();
	
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
				conNames();
				//inputLocTime(true);
				//need to input time


	}

	
	public void inputWedNames(boolean groomFirst) {
		if(groomFirst){
			System.out.println("What is the groom's name?");
			groom = scan.nextLine();
			if(groom.trim().isEmpty()){
				System.out.println("Invalid input, the groom can't have a blank name.");
				inputWedNames(groomFirst);
				}
			}
			System.out.println("What is the bride's name?");
			bride = scan.nextLine();
			if(bride.trim().isEmpty()){
				System.out.println("Invalid input, the bride can't have a blank name.");
				inputWedNames(false);
				}
			if(bride.equals(groom)){
				System.out.println("Wow, the groom and the bride have the same names!");
			}
		
		} 
		
		
	public void conNames() {
		System.out.println("Please confirm the names inputed are correct.\n"+
				"The groom's name is: "+ groom + 
				"\nThe bride's name is: " + bride +
				"\n1 - Continue "+
				"\n2 - Revise names");
		
		if(!scan.hasNextInt()) {
			System.out.println("Please enter a number!");
			conNames();
		}
		confirm = scan.nextInt();
		if(confirm == 1){
			info.add(groom);
			info.add(bride);
			inputLocTime(true);
		}
		if(confirm == 2){
			System.out.println("Please revise the names");
			inputWedNames(true);
		}
//		else{
//			System.out.println("Invalid.");
//			conNames(true);
//		}
	}
		
		
	
	public void inputLocTime(boolean locFirst){
		if(locFirst){
			System.out.println("Enter the location");
					location = scan.nextLine();
//					if(location.trim().isEmpty()){
//						System.out.println("Blank input, try again");
//						location = scan.nextLine();
//					}
//					
					if(Pattern.matches("[a-zA-Z]+", location)){  
						System.out.println("Your location is: " + location); 
								locFirst = false;
					}
					else if (location.equals("")){
						System.out.println("Invalid Input");
						inputLocTime(true);
					}
					else{System.out.println("Your location can't contain numbers.");
					inputLocTime(true);
					}
					
					
			}
					System.out.println("Input the date in the format (MM/DD/YYYY)\n"+
							"We are currently not accepting any dates before 06-07-2016");
					System.out.println("Ex: Today is " + format.format(new Date()));// create the current date and formats it
					Date date = null;
					while (date == null) {
					    String line = scan.nextLine();// try catch to make sure the date inputed is not before the limit
					    try {
					        date = format.parse(line);
					        Date limit = format.parse("06-07-2016");
					        if(date.compareTo(limit)<= 0){
					        	System.out.println("Invalid date");
					        	inputLocTime(false);
					        }
					        if(date.compareTo(limit) > 0){
					        	info.add(format.format(date));
					        	
					        }
					        
					    } catch (ParseException e) {
					        System.out.println("Sorry, that's not valid. Please try again.");
					    }
					}	
					getQuantity(true);	
}

	public int getQuantity(boolean print) {
		if(print){	
			System.out.println("Please input the amount of Invitation Cards you would like to purchase.\n"+
					"We only accept multiple of 5's.");
				numCards = scan.nextInt();
				if(numCards % 5 ==0){
					System.out.println("worked");
					info.add(numCards);
					getDesign();
//					if(!scan.hasNextInt()) {
//						System.out.println("Sorry, we only accept numbers.");
//						numCards = scan.nextInt();
//					} 
				}
				else{
					System.out.println("Invalid Input");
					getQuantity(true);
				}
		}
		return numCards;
	}
	
	public int getDesign() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void getPrice(InvitClient c) {
		if(c.getDesign() == InvitClient.GOLD){
			 System.out.println(1.80 * c.getQuantity(false));
		}
		if(c.getDesign() == InvitClient.SILVER){
			System.out.println(1.75 * c.getQuantity(false));
		}
		if(c.getDesign() == InvitClient.BRONZE){
			System.out.println(1.50 * c.getQuantity(false));
		}
	}
	public void canAfford(double price) {
		// TODO Auto-generated method stub
		
	}
	public boolean calculatePrice(int x, int budget) {
		// TODO Auto-generated method stub
		return false;
	}	
	




}