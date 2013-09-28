
public class ATMManager
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		BankAccount[] ba = new BankAccount[3];
		ba[0] = new SavingsAccount(5000,"Abc Def","123","4553",5.5);
		ba[1] = new CheckingAccount(10000,"Ghf Ijk","345","6789");
		ba[2] = new FDAccount(22,20000,"Pqr Stu","567","8991");
		long acc = Long.parseLong(args[0]);
		for(int i=0;i<3;i++)
		{ 
			long chck = Long.parseLong(ba[i].getAccountNumber());
			if(acc==chck)
			{
				if(ba[i].compareTo(args[1]))
					System.out.println("Go on banking");
				else
					System.out.println("Given password doesn't not match.Unable to access account");
				break;
			}
			else
				System.out.println("Account not found");
		}
	}

}
