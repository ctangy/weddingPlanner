package weddingPlans;

public interface Budget {
	
	//christine
	
	//returns true if the price is less than the budget, false otherwise
	void welcome();
	public void canAfford(double price);
	public boolean calculatePrice(int x, int budget);
}
