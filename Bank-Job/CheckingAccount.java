public class CheckingAccount extends BankAccount
{
	private static final int FREE_TRANSACTIONS = 3;
	private static final double TRANSACTION_FEES = 2.0;
	private int transactionCount = 0;
	
	public CheckingAccount(double BalanceInit, String name, String address)
	{
		super(BalanceInit,name,address);
	}
	
	public double getBalance(){
			return super.getBalance();
	}
	public void deposit(double amountIn)
	{
		transactionCount++;
		super.deposit(amountIn);
	}
	public void withdraw(double amountOut)
	{
		transactionCount++;
		super.withdraw(amountOut);
	}
	public void deductFees()
	{
		if(transactionCount > FREE_TRANSACTIONS)
		{
			double fees = TRANSACTION_FEES * (transactionCount - FREE_TRANSACTIONS);
			super.withdraw(fees);
		}
		transactionCount = 0;
	}
}