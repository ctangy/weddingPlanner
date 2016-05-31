package weddingPlans;

import java.text.ParseException;
import java.util.ArrayList;

public interface InvitClient {
	void enterSite();
	int getQuantity(boolean print);
	int getDesign();
	public static final int GOLD = 2;
						int SILVER = 1;
						int BRONZE = 0;
	void inputLocTime(boolean locFirst);
	void inputWedNames(boolean groomFirst);
	void conNames(boolean questions);
	String getTime();
	//ArrayList<String> getGeneralInformation();
}
