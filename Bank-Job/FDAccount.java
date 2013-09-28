
public class FDAccount extends BankAccount implements java.io.Serializable
{	static final long serialVersionUID = 0;
	private int invest_Time;
	private double rate;
	private int count;
	private double interest_Final;
	FDAccount(int time,double initial,String name,String address,String password)
	{
		super(initial,name, address,password);
		invest_Time = time;
		if(invest_Time<=12)
			rate = 6.0;
		else if(12<invest_Time && invest_Time<=36)
			rate = 7.0;
		else
			rate = 8.0;
		count = 0;
	}
	public void deposit(double amount)
	{
		if(count<1)
		{
			super.deposit(amount);
			fdInterest();
			System.out.println("Rate:"+rate+"\nInterest:"+interest_Final);
			++count;
		}
		else
			System.out.println("Transaction closed");
	}
	public void transfer(BankAccount b,double amount)
	{
		if(count<1)
		{
			if(b.withdraw(amount))
			{
		       super.deposit(amount);
			   fdInterest();
			   System.out.println("Rate:"+rate+"\nInterest:"+interest_Final);
			   count+=1;
			}
		}
		else
			System.out.println("Transaction closed");
	}
	public boolean withdraw(double amt)
	{
		System.out.println("Cannot withdraw from the account");
		return false;
	}
	public void fdInterest()
	{
		interest_Final = getBalance()*(Math.pow(1+(rate/1200),invest_Time));
	}
	

}
