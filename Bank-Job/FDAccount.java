
public class FDAccount extends BankAccount
{
	private int time;
	private int transactionCount = 0;
	private double rate;
	public FDAccount(double BalanceInit, String name, String address,int time)
	{
		super(BalanceInit,name,address);
		this.time=time;
		if(this.time<=12)
		{
			this.rate=6.0;
		}
		else if(this.time>12 && this.time<=36)
		{
			this.rate=7.0;
		}
		else
		{
			this.rate=8.0;
		}
	
	}
	public double getRate()
	{
		return this.rate;
	}
	public double getBalance()
	{
		return super.getBalance();
	}
	public void deposit(double amountIn)
	{	if(this.transactionCount<1)
		{
			transactionCount++;
			super.deposit(amountIn);
		}
		else
			System.out.println("You cannot deposit more than one time");
	}
	public void withdraw(double amountOut)
	{
		System.out.println("Withdrawal not allowed");
	}
	public void transfer(BankAccount deductory, double amount)
	{
		if(this.transactionCount<1)
		{
			transactionCount++;
			deductory.withdraw(amount);
			super.deposit(amount);
					
		}
		else
			System.out.println("You cannot transfer more than one time");
		
			
	}
	

}

