
public class CheckingAccount extends BankAccount implements java.io.Serializable 
{	static final long serialVersionUID = 0;
	private int transactionCount;
	private double fee;
	private static int max_free_Transactions = 2;
	private static double fee_per_Transaction = 2.0;
	CheckingAccount(double initial,String name,String address,String password)
	{
		super(initial,name,address,password);
		transactionCount=0;
	}
	public void deposit(double amount)
	{
		super.deposit(amount);
		++transactionCount;
	}
	public boolean withdraw(double amt)
	{
		if(super.withdraw(amt))
		{
			++transactionCount;
			return true;
		}
		return false;
	}
	public void deductFee()
	{
		if(transactionCount> max_free_Transactions)
		{
			fee = (transactionCount-max_free_Transactions)*fee_per_Transaction;
			transactionCount = 0;
		}
	}
	public String toString()
	{
		return super.toString()+"\nTransaction fee:"+fee;
	}
}
