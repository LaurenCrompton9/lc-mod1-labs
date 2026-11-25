package labs2;

public class Program {

	public static void main(String[] args) {
		int mark = 66;
		if (mark >= 50 && mark <= 60 ) {
			System.out.println("Pass");
		} else if(mark >= 61 && mark <= 70) {
			System.out.println("Merit");
		} else if(mark >= 71 && mark <= 100) {
			System.out.println("Distinction");
		} else if(mark < 1 && mark > 100){
			System.out.println("Error: marks must be between 1..100");
		} else {
			System.out.println("Fail");
		}

	}

}
