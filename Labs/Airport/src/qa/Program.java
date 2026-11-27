package qa;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String again = "Y";
		while (again.equals("Y")) {
		System.out.println("Enter GBP amount:");
		double gbp = scanner.nextDouble();
		 System.out.println("Choose currency (1=USD, 2=EUR, 3=JPY):");
         int chosen = scanner.nextInt();
       
         System.out.println("Choose cutomer type: VIP(V), Regular(R), Staff(S)");
         String customerType = scanner.next();
         
		double converted = 0;
		double fee;
		double tax = 0;
		double afterFee;
		double afterTax;
		int finalAmount;
	
		if(gbp > 100) {
			fee = gbp * 0.05;
		}else {
			fee = gbp * 0.25;
		}
		if(customerType.equals("R")) {
			tax = gbp * 0.10;
		} else if(customerType.equals("v")) {
			tax = gbp * 0.05;
		} else if (customerType.equals("S")) {
			tax = gbp * 0;
		}else {
	
			System.out.println("Invalid selection.");
		}
		afterFee = gbp - fee;
		afterTax = afterFee - tax;
		switch (chosen) {
		case 1: 
			converted = afterTax * 1.25;
			break;
		case 2: 
			converted = afterTax * 1.15;
			break;
		case 3:
			converted = afterTax * 180.50;
			break;
			default: System.out.println("Invalid selection.");
		}
		finalAmount = (int) converted;;
		System.out.println("After fee: " + afterFee);
		System.out.println("After tax: " + afterTax);
		System.out.println("Final amount: " + finalAmount);
		 System.out.println("Run again? (Y/N)");
         again = scanner.next();
	}
		scanner.close();
	}

}
