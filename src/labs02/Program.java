package labs02;

public class Program {

	public static void main(String[] args) {
		Account myAccount = new Account(16, "Lauren", 20000.00);
		myAccount.Deposit(150);
		myAccount.Withdraw(50);
		System.out.println(myAccount.getDetails());
		
		Account[ ] accounts = new Account[3];
		accounts[0] = new Account(1, "Tom", 500);
		accounts[1] = new Account(2, "Kelvin", 800);
		accounts[2] = new Account(3, "Melissa", 15000);
		for (Account account : accounts) {
			System.out.println(account.getDetails());
		}
	}

}
