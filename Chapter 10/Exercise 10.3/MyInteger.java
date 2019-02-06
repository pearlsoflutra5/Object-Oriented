/*
Kacie Rae
2-1-19
Exercise 10.3 creating MyInteger class and using static and non-static methods.  

(because we have a getter we can assume that value can be private)

UML Diagram for MyInteger
-----------------------------------------
- value:int  
-----------------------------------------
+ MyInteger(value: int)
+ getValue(): int

+ isEven(v: int): boolean  <<static>>
+ isEven(v: MyInteger): boolean <<static>>
+ isEven(): boolean

+ isOdd(v: int): boolean  <<static>>
+ isOdd(v: MyInteger): boolean  <<static>>
+ isOdd(): boolean

+ isPrime(v: int): boolean <<static>>
+ isPrime(v: MyInteger): boolean  <<static>>
+ isPrime(): boolean

+ equals(v: int): boolean
+ equals(v: MyInteger): boolean 

+ parseInt(c: Char []): int <<static>>
+ parseInt(s: String): int  <<static>>
----------------------
*/

class MyInteger {
	private int value;
	
	public MyInteger(int value){
		this.value = value;
	}
	
	public int getValue(){
		return this.value;	
	}
	
	public static boolean isEven(int v){
		return (v % 2 ==0);	
	}	
	public static boolean isEven(MyInteger v){
		return (v.getValue() % 2 == 0);		
	}
	public boolean isEven(){
		return isEven(this.value);
	}
	public static boolean isOdd(int v){
		return (v % 2 != 0);		
	}
	
	public static boolean isOdd(MyInteger v){
		return (v.getValue() % 2 != 0);			
	}
	public boolean isOdd(){
		return isOdd(this.value);	
	}
	
	public static boolean isPrime(int v){
		boolean answer = true;
		if (v == 1 || v == 2){
			answer = true; 
		}
		
		for (int i = 2; i <= v/2; i++) {
			if (v > 2 && v % i == 0){
				answer = false; 
			}
			else {
				answer = true;
			}
		}
		return answer;
					
	}
	public static boolean isPrime(MyInteger v){
		return isPrime(v.getValue());	
	}
	public boolean isPrime(){
		return isPrime(this.value);		
	}
	
	public boolean equals(int v){
		return (v == this.value);		
	}
	
	public boolean equals(MyInteger v){
		return (v.getValue() == this.value);				
	}
	public static int parseInt(char[] c){
		String s = new String(c);
		return parseInt(s);		
	}
	public static int parseInt(String s){
		int result = 0;
		for (int i = 0; i < s.length(); i++){
			result = result * 10 + (s.charAt(i) - '0'); 
		}
		return result;		
	}
	

}
















