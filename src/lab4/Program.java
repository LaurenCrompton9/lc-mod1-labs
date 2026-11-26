package lab4;

public class Program {

	public static void main(String[] args) {
		int[ ] numbers = { 1, 3, -5, 7, 0, 4, 6, 8 };
		String[ ] students = {"Tom", "Harry", "Alex", "Jack", "Stuart"};
		int[ ] marks = {72, 66, 85, 91, 44};
		int sum = 0;
		for(int i = 0; i <numbers.length; i++) {
			sum += numbers[i];
		} System.out.println("The sum is: " + sum);
		
		double average = sum / numbers.length;
		 System.out.println("the average is: " + average);
		 
		 int min = numbers[0];
			for (int i = 1; i < numbers.length; i++) {
				if(numbers[i] < min) {
					min = numbers[i];
				} System.out.println(min); // index one is the smallest we've see so far. Go through all the indexes. 
				                          //If the number at the next index is less than the previous, assign it to min.
			}
			 int max = numbers[0];
				for (int i = 1; i < numbers.length; i++) {
					if(numbers[i] > max) {
						max = numbers[i];
					} System.out.println(max); // the opposite of above
				}
				
				int indexZero = -1;
				for(int i = 0; i < numbers.length; i++) {
					if (numbers[i] == 0) {
						indexZero = i;
						break;
						}
				}
				System.out.println(indexZero);
				
			
		
				for (int i = 0; i < students.length; i++) {
					System.out.println(students[i] + ": " + getGrade(marks[i]));
				}
				double currentMoney = 100;
				double interestRate = 0.05;
				int years = 0;
				
				while (currentMoney < 200) {
					currentMoney = currentMoney * (1 + interestRate);
					years++;
				} System.out.println(years);
				
				multiplicationTable();
			}
	
		static String getGrade(int mark) {
			if (mark >= 50 && mark <= 60 ) {
				return "Pass";
			} else if(mark >= 61 && mark <= 70) {
				return "Merit";
			} else if(mark >= 71 && mark <= 100) {
				return "Distinction";
			} else if(mark < 1 && mark > 100){
				return "Error!";
			} else {
				return "Fail";
		}		
		}
		static void multiplicationTable() {
			 for (int row = 1; row <= 10; row++) {

			        for (int col = 1; col <= 10; col++) {
			            System.out.printf("%5d", row * col);
			        }
			        //for as long as the row and the column are equal to or less than 10, add an additional row and column.
			        // system times the column number by the row number and prints the result of that sum.
			        System.out.println();
			    }
		}

		
		
		
}

		
		


		
		
	
		
	



