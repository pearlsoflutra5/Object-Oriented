/*
Kacie Rae 
2-1-19
Exercise 10.3 calling the MyInteger Class and testing all non-static and static methods.  
*/

class Exercise10point3 {
	public static void main(String[] args) {
		MyInteger myInt = new MyInteger(5);
		System.out.println("Testing isEven funtions: ");
		System.out.println("\t" + MyInteger.isEven(6));
		System.out.println("\t" + MyInteger.isEven(new  MyInteger(12)));
		System.out.println("\t" + myInt.isEven());
		
		System.out.println("");
		
		System.out.println("\t" + MyInteger.isOdd(5));
		System.out.println("\t" + MyInteger.isOdd(new MyInteger(16)));
		System.out.println("\t" + myInt.isOdd());
		
		System.out.println("");
		
		System.out.println("\t" + MyInteger.isPrime(6));
		System.out.println("\t" + MyInteger.isPrime(new MyInteger(334533)));
		System.out.println("\t" + myInt.isPrime());
		
		System.out.println("");
		
		System.out.println("\t" + myInt.equals(6));
		System.out.println("\t" + myInt.equals(new MyInteger(78)));
		
		System.out.println("");
		
		char c[] = new char[] {'6','8','9'};
				
		System.out.println("\t" + MyInteger.parseInt(c));
		System.out.println("\t" + MyInteger.parseInt("88"));

		
	}
}









