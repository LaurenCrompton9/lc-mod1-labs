package labs02;

public class Account {
	private int id;
	private String owner;
	private double balance;
	public Account(int id, String owner, double balance){
		this.id = id;
		this.owner = owner;
		this.balance = balance;
	}
	public void Deposit(double amount) {
		if(amount < 0) {
			System.out.println("You cannot deposit a negative amount.");
			}
			else {
				balance = amount + balance;
		}
	}
	public void Withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Insufficient funds.");}
		else {
				balance = balance - amount;
			}
		}
	
	public String getDetails(){
		return "ID: " + id +
				", Owner: " + owner +
				", Balance: " + balance;
	}
	public void addInterest() {
		balance = balance * 1.25;
	}
	public String getOwner() {
		return owner;
	}
}
