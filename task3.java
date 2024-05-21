package codsoft.com;

import java.util.Scanner;

class ATMInterface1 {
	double balance;
	
	public  ATMInterface1(double bal)
	{
		balance = bal;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	
	public void withdraw(double amount)
	{
		if(amount <= balance)
		{
			balance = balance - amount;
		}
		else
		{
			System.out.println("Withdraw not possible");
		}
	}	
}

class ATM{
	
	private ATMInterface1 A1;
	
	public ATM(ATMInterface1 A1) 
	{
		this.A1 = A1;
	}
	
	public void Menu() 
	{
		System.out.println("--Welcome--");
		System.out.println("To The ATM Machine");
		System.out.println("\n 1.Check Balance \n 2.Deposit \n 3. Withdraw \n 4.Exit ");
	} 
	
	public void Transcation()
	{
		int choice;
		double amount;
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		Menu();
		System.out.println("Enter your Choice : ");
		choice = sc.nextInt();
		
		switch(choice) {
		
		 case 1:{
			 System.out.println("The Balance in your Account is:"+ A1.getBalance());
			 break;
		 }
		 case 2:{
			 System.out.println("Enter the amount that you want to Deposit: ");
			 amount = sc.nextDouble();
			 if(amount >0) {
				 A1.deposit(amount);
				 System.out.println("Amount is Deposited Successfully...");
				
			 }
			 else {
				 System.out.println("Invalid deposit Amount");
			 }
			 break;
		 }
		 case 3:
		 {
			 System.out.println("Enter the amount that you want to Withdraw: "); 
			 amount = sc.nextDouble();
			 if (amount > 0 && amount <= A1.balance) {
				 A1.withdraw(amount);
				 System.out.println(" Amount is Withdraw Successfully...");
				 
			 }
			 else {
				 System.out.println("Invalid Withdraw Amount"); 
			 }
			 break;
		 }
		 case 4:{
			 System.out.println("Thankyou for Visting  the ATM. ");
			 return;
		 }
		 default:{
			 System.out.println("Invalid Choice. Please try again.");
		 }
		}	
	}	 
}
}

public class ATMInterface{
	
	public static void main(String[] args) {
		
		ATMInterface1 A = new ATMInterface1(10000.0);
		
		ATM a = new ATM(A);
		
		a.Transcation();
	}	
	
}



	


