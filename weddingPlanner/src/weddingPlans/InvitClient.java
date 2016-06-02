package weddingPlans;

import java.text.ParseException;
import java.util.ArrayList;

public interface InvitClient {
	void enterSite();
	int getQuantity(boolean print);
	int getDesign(boolean questions);
	public static final int GOLD = 1;
						int SILVER = 2;
						int BRONZE = 3;
	void inputLocTime(boolean locFirst);
	void inputWedNames(boolean groomFirst);
	void conNames();
}
