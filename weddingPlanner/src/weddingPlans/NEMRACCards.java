package weddingPlans;

public class NEMRACCards implements InvitationCompany {
	InvitClient client;
	
	public NEMRACCards( InvitClient c){
		client = c;
	}
	
	public int[] getpackageSize() {
		// TODO Auto-generated method stub
		return null;
	}

	public InvitationCompany getInstance(InvitClient c) {
		return new NEMRACCards(c);
	}

	public int getPrice(InvitClient c) {
		if(c.getDesign() == InvitClient.GOLD){
			return (2.50 * Invitclient.getQuantity)
			
		}
	}

	/**
	 * @param args
	 */
	

}
