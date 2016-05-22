package weddingPlans;

import java.util.ArrayList;

public class NEMRACCards{
	InvitClient client;

	public NEMRACCards( InvitClient c){
		client = c;
	}

	public int[] getpackageSize() {
		// TODO Auto-generated method stub
		return null;
	}

	public NEMRACCards getInstance(InvitClient c) {
		return new NEMRACCards(c);
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
		System.out.println("Incorrect Input.");;
	}	

	public ArrayList<String> getDesignChoices() {
		// TODO Auto-generated method stub
		return null;
	}

}

