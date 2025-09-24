package inheritance;

public class BankAccount {

	int balance;
	String name;
	
	// constructor for somebody bringing money into this account
	public BankAccount(String n, int a) {
		balance = a;
		name = n;
	}
	
	// constructor for somebody starting an empty account
	public BankAccount(String n) {
		name = n;
		balance = 0;
	}
	
	public void withdraw(int m) {
		balance -= m;
	}
	public void deposit(int m) {
		balance += m;
	}
	
	// what we want to see when this class is printed
	public String toString() {
		return "Your account holds $" + balance + ", " + name;
	}
 }

