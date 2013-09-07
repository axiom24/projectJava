/**
 * This class BankAccount creates a bank account giving you an account no and takes the
 * initial amount through a constructor. It has several methods such as deposit,withdraw,
 * transfer,getbalance and attempts(i.e. no of transactions).
 * @author livingstore
 *
 */


	public class BankAccount 
	{
		
		private static long accountNumber = 180020131111L;
		public long accNo = 0;
		private double balance;
		public int numberOfTransactions = 0;
		public int minDeposit = 500;
/**
 * Constructor BankAccount takes the intial money as argument and createas a new account		
 * @param money
 */
		public BankAccount(double money)
		{
			this.accNo = accountNumber;
			accountNumber++;
			this.balance=money;
		
			
		}	
/**
 * Method deposit takes amountin ,the amount to be deposited as argument and add it
 * to the balance.		
 * @param amountin
 */
		public void deposit(double amountin)	
		{
				this.balance=balance+amountin;
				this.numberOfTransactions++;		
				
		}

		public boolean withdraw(double amountout)	
		{
			if(amountout<balance-minDeposit)
			{	
				this.balance=this.balance-amountout;
				this.numberOfTransactions++;
				return true;
			
			}
			else
				return false;
		}

		public double getBalance()
		{
			return this.balance;
		}

		public int attempts()
		{
			return this.numberOfTransactions;
		}

		public void transfer(BankAccount tr, double amount)
		{
			
			if(this.withdraw(amount))
				tr.deposit(amount);
		    
		       
		}

	}



