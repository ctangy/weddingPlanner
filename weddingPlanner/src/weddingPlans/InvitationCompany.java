package weddingPlans;

import java.util.ArrayList;

public interface InvitationCompany {
	ArrayList<String> getDesignChoices();
	int[] getpackageSize();
	NEMRACCards getInstance(InvitClient c);
	int getPrice(InvitClient c);
}
