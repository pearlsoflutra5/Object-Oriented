/*
Kacie Rae
4-26-19
Exercise 17.14 and 17.15 using Java IO to encode and decode files.
*/
import java.io.*;
import java.util.Scanner;

class Exercise17point14and15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Options----\n(1) Encrypt \n(2) Decrypt\n-----------\nYour Choice: ");
		int choice = input.nextInt();
		
		input.nextLine();
		System.out.print("Enter input file name: ");
		File fileIn = new File(input.nextLine());
		System.out.print("Enter output file name: ");
		File fileOut = new File(input.nextLine());
		
		try(			
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(fileIn));
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(fileOut));
		) {
			if (choice == 1){
				encrypt(in, out);
			}
			else if (choice == 2){
				decrypt(in, out);
			}
			else {
				System.out.println("You didn't enter 1 or 2 for your choice.");
			}
		}
		catch (IOException e) {
			System.out.println("File could not be opened.");
		}
		System.out.println("Process complete.");
		
	}
	public static void encrypt(BufferedInputStream in, BufferedOutputStream out){
		try {
			int value = in.read();
			while (value != -1) {
				out.write(value + 5);
				
				value = in.read();
			}
		} 
		catch (IOException e) {
			System.out.println("Something happened to make this not work......");
		}
	}
	public static void decrypt(BufferedInputStream in, BufferedOutputStream out){
		try {
			int value = in.read();
			while (value != -1) {
				out.write(value - 5);
				
				value = in.read();
			}
		} 
		catch (IOException e) {
			System.out.println("Something happened to make this not work......");
		}	
	}
}