package inheritance;

public class GreatAccount extends BankAccount {
	
	int withdrawalsLeft = 3;
	int monthCount = 0;
	boolean hasWithdrawn = false;
	
	public GreatAccount(String n) {
		super(n);
	} 
	
	public GreatAccount(String n, int a) {
		super(n, a);
	}

	public void withdraw(int amount) {
		if (withdrawalsLeft <= 0) {
			System.out.println("you have exceeded the number of withdrawals for this month");
		}
		else {
			super.withdraw(amount);
			withdrawalsLeft --;
			hasWithdrawn = true;
		}
	}
	
	public void nextMonth() {
		withdrawalsLeft = 3;
		monthCount = (monthCount + 1) % 12;
		
		if (monthCount == 0) {
			if (hasWithdrawn) {
				balance *= 2;
			}
			hasWithdrawn = false;
		}
	}
	
	
}
