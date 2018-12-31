package lab4_2;

public class SavingsAccount extends Account {
	final  int minimumBalance=500;
		 @Override
		 public void withdraw(double amount)
		 {
			 if((super.getsBalance()- amount)>minimumBalance)
			 {
				 System.out.println(amount+"withdrawed");
			super.withdraw(amount);
			 }
			 else
				 System.out.println("your balance is insufficient");
		
		 }
		  
		
	 }
	  
	


