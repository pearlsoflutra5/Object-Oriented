import java.util.Date;

class Exercise9point7{
	public static void main(String[] args) {
	Account account1 = new Account(1122, 20000);
	account1.setAnnualInterestRate(4.5);
	double withdrawalAmount = 2500;
	double depositAmount = 3000;
	System.out.println("The original balance is: " + account1.getBalance());
	
	System.out.println("The account monthly interest is: " + account1.getMonthlyInterest());
	
	System.out.println("The balance after withdrawl is: " + account1.withdraw(withdrawalAmount));
	
	System.out.println("The balance after deposit is: " + account1.deposit(depositAmount));
	
	System.out.println("The date it was created is: " + account1.getDateCreated());
	
			
	}
}