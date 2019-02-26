/*
Kacie Rae
2-19-19
Exercise 12.3 Writing exceptions for an Int Array. 
*/


import java.util.Scanner;


class Exercise12point3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] test = new int[100];
		for (int i = 0; i < 100; i++){
			test[i] = (int)(Math.random() * 10000);
		}
		for(int i = 0; i < 10; i++){
			System.out.print("Type an index in the array, 0-99: ");
			int index = input.nextInt();
			try {
				System.out.println("The number at position " 
				+ index + " is " + test[index]);
				
			}
			catch (ArrayIndexOutOfBoundsException ex){
				System.out.println("Out of Bounds: type and integer from 0 to 99");
			}
			System.out.println("");
		}
	}
}