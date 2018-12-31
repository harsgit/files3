package lab4_2;

public class CreditAccount extends Account{
	final long overDraft=50000;

	public CreditAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreditAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}
	
@Override
public void withdraw(double amount)
{
	if(overDraft-amount>0)
	{
		System.out.println(amount+" "+" is Withdrawn");
	


		super.withdraw(amount);
	}
	else
		System.out.println("Amount is higher than your overDraft");
}

}

