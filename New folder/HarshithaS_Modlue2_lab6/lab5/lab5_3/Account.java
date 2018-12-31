





public  abstract class Account {
	
	private long accNum;
	protected double balance=500;
	 private Person accHolder;
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	 public void deposit(double amount)
	 {
		balance+=amount; 
	 }
	  public  abstract void withdraw(double amount);
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Account(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	public double getsBalance()
	{
		return balance;
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance +  "]";
	}
	
	
	

}




