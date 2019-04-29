/*
Kacie Rae
4-29-19
Exercise 18.3
*/
import java.util.Scanner;
class Exercise18point3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		System.out.print("What is your first number: ");
		int m = input.nextInt();
		
		System.out.print("What is your second number: ");
		int n = input.nextInt();
		
		
		if (m % n == 0){
			System.out.println("The Greatest Common Divisor is " + n); 
		}
		else {
			System.out.println("The Greatest Common Divisor is "  + (m%n));
		}
		
	}
}