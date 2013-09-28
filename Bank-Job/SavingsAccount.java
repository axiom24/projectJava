
public class SavingsAccount extends BankAccount implements java.io.Serializable
{	static final long serialVersionUID = 0;
	private double rate;
	private double interest;
	private double temp;
	private double taxDeducted;
	SavingsAccount(double initial,String name,String address,String password,double inter)
	{
		super(initial,name,address,password);
		rate = inter/100;
		interest = 0;
		temp = getBalance();
	}
	public void addInterest()
	{
		interest = temp*rate;
		taxDeducted = calculateTax(interest);
		temp = temp+interest-taxDeducted;
		deposit(temp);
	}
}
