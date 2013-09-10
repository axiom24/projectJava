public class SavingsAccount extends BankAccount{
	private double rate;
	public SavingsAccount(double money, String name, String address, double rate) 
	{

		super(money, name, address);
		this.rate=rate;		
	}
	
	public void addInterest()
	{
		double interest = (super.getBalance()*this.rate)/100;
		super.deposit(interest);
	}
	
}