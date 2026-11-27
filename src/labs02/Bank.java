package labs02;

public class Bank {
	Account[] bankAccounts = new Account[3];
public Bank() { 
bankAccounts[0] = new Account(1, "Phil", 650);
bankAccounts[1] = new Account(2, "Tony", 850);
bankAccounts[2] = new Account(3, "Eric", 2000);
}
Bank bank = new Bank();

 public Account addAccount (String owner, double balance) {
	 for(int i = 0; i <= bankAccounts.length; i++) {
		 Account newAccount = new Account(i, owner, balance);
		 bankAccounts[i] = newAccount;
		 return newAccount;
	 }
	 return null;
 }
 public Account getAccount(String owner) {

	    for (int i = 0; i < bankAccounts.length; i++) {

	        if (bankAccounts[i] == null) {
	        	return null;
	        }
	            bankAccounts[i].getOwner().equals(owner); {

	            return bankAccounts[i];
	        }
	    }

	  return null;
	}

}