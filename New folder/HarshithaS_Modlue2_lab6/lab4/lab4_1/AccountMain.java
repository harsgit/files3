package lab4_1;

public class AccountMain {
	 

		private static  int id=1000;
		public static int generateId()
		{
			return ++id;
		}
	public static void main(String[] args) {	
		Person p1=new Person();
		Account a1=new Account();
		Account a2=new Account();
		SavingsAccount s=new SavingsAccount();
		CreditAccount c=new CreditAccount();
		p1.setName("Smith");
		Person p2=new Person();
		a1.setBalance(2000.0);
		p2.setName("Kathy");
		a2.setBalance(3000);
		/*int y=AccountMain.generateId();
		System.out.println(y);*/
	a1.setAccNum(AccountMain.generateId());
		a2.setAccNum(AccountMain.generateId());
		a1.deposit(2000);
		a2.withdraw(2000);
		
		System.out.println("Balance of"+" "+p1.getName()+" "+"is :"+a1.getsBalance());
	
		System.out.println("Balance is"+" "+p2.getName()+" "+"is :"+a2.getsBalance());
	
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		s.withdraw(4000);
		c.withdraw(3000);
	}	
	}
	



