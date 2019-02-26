/*
Kacie Rae
2-22-19
Exercise 12.19 Counting words in Gettysburg address. 
*/

import java.util.Scanner;
import java.net.URL;

class Exercise12point19 {
	public static void main(String[] args) {
		try{
			URL url = new URL("http://cs.armstrong.edu/liang/Lincoln.txt");
			Scanner input = new Scanner(url.openStream());
			int words = 0;
			int count = 0;
			
			while (input.hasNext()){
				if (Character.isLetter((input.next()).charAt(0))) {
					words++;
				}
			}
		
			System.out.println("The number of words in the Gettysburg Adress: " + words);
			
		}
		
		catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		}
		
		catch (java.io.IOException ex) {
			System.out.println("File Does Not Exist");
		}
		
	}
}