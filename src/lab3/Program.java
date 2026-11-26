package lab3;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {

		System.out.println(theLunchQueue());
		}
	
	public static int getInt(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextInt(); 
	}
	
	static String getString(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner(System.in);
		return s.nextLine();
		}
	public static String theLunchQueue() {
		String dishSelected = getString("What dish would you like(Fish, Burgers or veg)?");
		
		int potatoes = getInt("How many potatoes would you like?");
		int sprouts = getInt("How many sprouts would you like?");
		String meal = ("Your lunch order is: " + dishSelected + " with " + potatoes +  " potatoes" + sprouts + " sprouts");
		return meal;
	}

}
