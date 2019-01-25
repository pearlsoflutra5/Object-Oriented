/*
Kacie Rae 
1-18-19
Exercise 9.3 using the date class to show the time and date. 
*/

import java.util.Date;

class Exercise9point3 {
	public static void main(String[] args) {
		Date d1 = new Date(10000);
		Date d2 = new Date(100000);
		Date d3 = new Date(1000000);
		Date d4 = new Date(10000000);
		Date d5 = new Date(100000000);
		Date d6 = new Date(1000000000);
		Date d7 = new Date(10000000000L);
		Date d8 = new Date(100000000000L);
		System.out.println(d1.toString() + 
		"\n" + d2.toString() + 
		"\n" + d3.toString() + 
		"\n" + d4.toString() + 
		"\n" + d5.toString() + 
		"\n" + d6.toString() + 
		"\n" + d7.toString() + 
		"\n" + d8.toString());
	}
}