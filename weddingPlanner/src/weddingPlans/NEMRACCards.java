package weddingPlans;

public class NEMRACCards implements InvitationCompany{
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

	public int getPrice(InvitClient c) {
		if(c.getDesign() == InvitClient.GOLD){
			return (int) (1.80 * InvitClient.getQuantity());
		}
		if(c.getDesign() == InvitClient.SILVER){
			return (int) (1.75 * InvitClient.getQuantity());
		}
		if(c.getDesign() == InvitClient.BRONZE){
			return (int) (1.50 * InvitClient.getQuantity());
		}


	}

}

