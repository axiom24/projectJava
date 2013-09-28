
public abstract class BankAccount implements ITRules,Comparable,java.io.Serializable
{	static final long serialVersionUID = 0;
	private double balance;
	private String accountNumber;
	private int no_Of_Transactions;
	private static double min_Balance = 500.00;
	private static String starting_No = "180020131111";
	private PersonalDetails account_Holder;
	private LastTransaction transaction_Details;
	private Verifier myVerifier;
	BankAccount(double initial,String name,String address,String password)
	{
		balance = initial;
		no_Of_Transactions = 0;
		long n = Long.parseLong(starting_No);
		accountNumber = String.valueOf(n);
		++n;
		starting_No = String.valueOf(n);
		account_Holder = new PersonalDetails(name,address);
		transaction_Details = new LastTransaction("Deposit");
		myVerifier = new Verifier(password);
	}
	public void deposit(double amount)
	{
		balance+=amount;
		no_Of_Transactions++;
	}
	public boolean withdraw(double amount)
	{
		if(balance-amount>=min_Balance)
		{
			balance-=amount;
			no_Of_Transactions++;
			return true;
		}
		else
			return false;
	}
	public void transfer(BankAccount account,double amount)
	{
		if(account.withdraw(amount))
		{
			deposit(amount);
			no_Of_Transactions++;
			System.out.println("Transfer was successful");
		}
		else
			System.out.println("Unable to transfer due to insufficient funds");
	}
	public String toString()
	{
		return "Account Details:"+account_Holder.toString()+"\n"+transaction_Details.toString()+"\nAccount Balance:"+balance;
	}
	public double getBalance()
	{
		return balance;
	}
	public double calculateTax(double amt)
	{
		if(amt>10000&&amt<=30000)
		  return amt*rate1;
		else if(amt>30000&&amt<=75000)
			return amt*rate2;
		else if(amt>75000&&amt<=100000)
			return amt*rate3;
		else if(amt>100000)
			return amt*rate4;
		else
			return 0;
	}
	public boolean compareTo(Object someObject)
	{
		if(myVerifier.verifyPasssword(someObject))
			return true;
		else
			return false;
	}
	public String getAccountNumber()
	{
		return accountNumber;
	}
}
