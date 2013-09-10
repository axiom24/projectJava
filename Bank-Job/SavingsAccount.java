public class SavingsAccount extends BankAccount{
	private static final double rate = .75;
	public SavingsAccount(double money, String name, String address) {
		super(money, name, address);
		
	}
	
	public void addInterest()
	{
		double interest = (super.getBalance()*rate)/100;
		super.deposit(interest);
	}
	
}