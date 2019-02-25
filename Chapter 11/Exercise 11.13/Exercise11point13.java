/*
Kacie Rae
2-13-19
Exercise 11.13 removing duplicates in an Integer ArrayList
*/

import java.util.Scanner;
import java.util.ArrayList;

class Exercise11point13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.print("Enter 10 integers: ");
		for (int i = 0; i < 10; i++){
			list.add(input.nextInt());
		}
		
		removeDuplicate(list);
		
		System.out.print("The distinct integers are: ");
		for (int i = 0; i < list.size(); i++){
			System.out.print(list.get(i) + " ");
		}
	}
	
	public static void removeDuplicate(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++){
			for (int j = i + 1; j < list.size(); j++){
				if (list.get(i) == list.get(j)){
					list.remove(j);
				}
			}
		}
	}
	
	
	
}