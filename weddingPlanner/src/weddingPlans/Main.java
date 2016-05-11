package weddingPlans;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);

		System.out.println("Hi, Welcome to East Room! We are a wedding planner that guaratnee your\n"+
				"wedding to be fantastic!  What would you like to do today?\n"+
				"Please input the number corresponding to the option\n"+
				"1 - Set an Appointment(Venue, Catering, Attire) \n"+
				"2 - Buy Invitations");
		String in = scan.nextLine();
		getResponse(in);
	}


	public static void getResponse(String in){
		if(in.equals("1")){

		}
		else if(in.equals("2")){

		}
		else{
			retResponse();
		}
	}


	public static void retResponse() {
		Scanner scan= new Scanner(System.in);
		System.out.println("other responses");
		//String otherNum = scan.nextLine();
		
		
	}
}
	
	
