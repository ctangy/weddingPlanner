package weddingPlans;

public class Cost {
	public static int appointmentPrice = 100;
	public static int invitationPrice = 100;
	public static int total = 0;
	public static int cost(){
		total = appointmentPrice + invitationPrice;
		return total;
	}

}
