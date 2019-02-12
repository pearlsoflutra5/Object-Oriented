
class Ch9andCh10TestInfo {
	public static void main(String[] args) {
		int a = 1;
		for (int i = 0; i < 100; i++){
			a++;
		}
		System.out.println(a);
		
		java.math.BigInteger x = new java.math.BigInteger("3");
		java.math.BigInteger y = new java.math.BigInteger("7");
		x.add(y);
		System.out.println(x);
		
	}
	
}
/*
	public static void main(String[] args){
			String s = "University";
			s.replace("i", "ABC");
			System.out.println(s);
		
			System.out.print("A,B;C".replaceAll(",;", "#") + " ");
			System.out.println("A,B;C".replaceAll("[,;]", "#"));
	​	
			
		}
		​	
		Count myCount = new Count();
		​	int times = 0;
		​	for (int i=0; i<100; i++)
		​	increment(myCount, times);
		​	System.out.println(
		​	"myCount.count = " + myCount.count);
		​	System.out.println("times = "+ times);
		}

		public static void increment(Count c, int times) {
		​	c.count++;
		​	times++;
		}
		}

		class Count {
		int count;

		Count(int c) {
		​	count = c;
		}

		Count() {
		​	count = 1;
		}
		
		

String[] tokens = "A,B;C;D".split("[,;]");
	for (int i = 0; i < tokens.length; i++){
		System.out.print(tokens[i] + " ");
	}



//class Test
	public static void main(String[] args) {
		A a = new A();
		a.print();
	}
}

//class Test
class A {
	String s;
	
	A(String newS){
		s = newS;
	}
	public void print() {
		System.out.print(s);
	}
	


public class A {
	boolean x;

	public static void main(String[] args){
		A a = new A();
		System.out.println(a.x);
	}	
}




public class C{
	public static void main(String[] args){
		method1();
	}
	public  void method1(){ //this method would have to be static too to work
		method2();
	}
	public static void method2(){
		System.out.println("What is the radius " + c.getRadius());
	}
	Circle c = new Circle();
}

*/
/*
public class Test{
	public static void main(String[] args){
		Count myCount = new Count();
		int times = 0;
		
		 for (int i = 0; i < 100; i++)
			increment(myCount, times);
		System.out.println("count is " + myCount.count);
		System.out.println("times is " + times);

	}
	public static void increment(Count c, int times){
		c.count++;
		times++;
	}
}

public class Count{
	public int count;
	
	public Count(int c){
		count = c;
	} 
	public Count(){
		count = 1;
	}
}
*/


/*public static void main(String[] args) {
	int k = 1
	
	for (int i = 0; i< 100; i++ ){
		
	}
*/

/*public class Test {
	public static void main(String[] args) {

​	Count myCount = new Count();
​	int times = 0;
​	for (int i=0; i<100; i++)
​	increment(myCount, times);
​	System.out.println(
​	"myCount.count = " + myCount.count);
​	System.out.println("times = "+ times);
}

	public static void increment(Count c, int times) {
​		c.count++;
​		times++;
}
}

class Count {
		int count;

	Count(int c) {
​		count = c;
	}

	Count() {
​		count = 1;
	}
}	
	
}

*/
