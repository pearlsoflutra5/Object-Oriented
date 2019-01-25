/*
Kacie Rae
1-22-19
Exercise 9.7 creating an Account object class

UML Diagram
---------------
- id:int
- balance:double
- annualInterestRate:double
- dateCreated:Date
----------------
+ Account()
+ Account(id:int, balance:double)
+ getId(): int
+ getBalance(): double
+ getAnnualInterestRate(): double
+ setId(id:int)
+ setBalance(balance:double)
+ setAnnualInterestRate(annualInterestRate:double)
+ getDateCreated()
+ getMonthlyInterestRate(): double
+ getMonthlyInterest(): double
+ withdraw(): double
+ deposit(): double
----------------------
*/

import java.util.Date;

class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	public Account(){	
	}
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	public int getId(){
		return this.id;
	}
	public double getBalance(){
		return this.balance;
	}
	public double getAnnualInterestRate(){
		return this.annualInterestRate;
	}
	public void setId(int id){
		this.id = id;
	}
	public void setBalance(double balance){
		this.balance = balance;	
	}
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	public Date getDateCreated(){
		this.dateCreated = new Date();
		return this.dateCreated;
	}
	public double getMonthlyInterestRate(){
		double monthlyInterestRate = annualInterestRate / 100.0 / 12.0;
		return monthlyInterestRate;
		
	}
	public double getMonthlyInterest(){
		double monthlyInterestRate = getMonthlyInterestRate();
		double monthlyInterest = this.balance * monthlyInterestRate;
		
		return monthlyInterest; 
	}
	public double withdraw(double money){
		this.balance = this.balance - money;
		return this.balance;
	}
	public double deposit(double money){
		this.balance = this.balance + money;
		return this.balance; 
	}

}