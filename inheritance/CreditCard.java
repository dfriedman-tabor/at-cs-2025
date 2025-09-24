package inheritance;


public class CreditCard extends InterestAccount{

	public CreditCard(String n, int a, double r) {
		super(n, a, r);
	}
	
	public CreditCard(String n, double r) {
		super(n, r);
	}
	
	public void addInterest() {
		super.addInterest();
		withdraw(10);
	}
	
	public void withdraw(int amount) {
		if (balance - amount >= 100) {
			super.withdraw(amount);
		}
		else {
			System.out.println("you do not have the funds to withdraw this amount");
		}
	}
	
}
