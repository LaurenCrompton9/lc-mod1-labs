package lab3;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		System.out.println("What is the total weight(in pounds)?");
		Scanner amount = new Scanner(System.in);
	convertInputToStonesPounds(amount.nextInt());
	 System.out.println("What is the total weight(in Kg's)?");
	convertKgsToStonesPounds(amount.nextInt());
		//System.out.println(theLunchQueue());
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
		String meal = ("Your lunch order is: " + dishSelected + " with " + potatoes +  " potatoes " + sprouts + " sprouts");
		return meal;
	}
	static void convertInputToStonesPounds(int pounds) {
		int stones = pounds/14;
		  System.out.println(pounds + "lb is " + stones + " stone");
	}
	
	static void convertKgsToStonesPounds(int kg) {
		double pounds = kg * 2.20462;
		double stone = pounds / 14;
		  System.out.println(kg + "kg is " + stone + " stone");
	}
	

}
