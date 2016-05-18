package weddingPlans;

import java.util.ArrayList;

public interface InvitClient {
	void enterSite();
	int getQuantity(boolean print);
	int getDesign();
	public static final int GOLD = 2;
						int SILVER = 1;
						int BRONZE = 0;
	ArrayList<String> getNames();
	void inputLocTime(boolean locFirst);
	String getTime();
	ArrayList<String> getGeneralInformation();
}
