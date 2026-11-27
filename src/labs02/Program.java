package labs02;

public class Program {

	public static void main(String[] args) {
		
		int k = 100;

		Account myAccount = new Account(16, "Lauren", 100);
		//myAccount.addInterest();
		processAccount(myAccount);
		System.out.println(myAccount.getDetails());
//		Account partnerAccount = myAccount;
//		partnerAccount.addInterest();
//		System.out.println(myAccount.getDetails());
		
		incInt(k);
		System.out.println("K: " + k);
		Account[ ] accounts = new Account[3];
		accounts[0] = new Account(1, "Tom", 500);
		accounts[1] = new Account(2, "Kelvin", 800);
		accounts[2] = new Account(3, "Melissa", 15000);
		for (Account account : accounts) {
			System.out.println(account.getDetails());
		}
	}
	static void processAccount(Account acc){ 

		acc.addInterest();

	}
	
	private static void incInt(int x) {

		x++;

		}



}
