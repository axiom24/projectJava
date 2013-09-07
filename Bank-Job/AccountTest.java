import java.util.Scanner;
public class AccountTest {
public static void main(String[] args)
{	int acc;
	double amount1,amount2,amount;
	BankAccount account1 =new BankAccount(10000);
	BankAccount account2 =new BankAccount(5000);
	//Scanner input = new Scanner(System.in);
	//System.out.printf("Enter the account no. u wish to access:");
	//acc = input.nextInt();
	System.out.println(account1.accNo);
	System.out.println(account2.accNo);
	BankAccount account3 = new BankAccount(1000);
	System.out.println(account3.accNo);
	
	account1.transfer(account2, 2000);
	System.out.println("account1 balance = "+account1.getBalance());
	System.out.println("account2 balance = "+account2.getBalance());
	System.out.println("account1 numberOfTransactions = "+account1.numberOfTransactions);
	System.out.println("account2 numberOfTransactions = "+account2.numberOfTransactions);



	/*account1.deposit(500);
	account1.deposit(5000);
	account1.withdraw(430);
	account2.deposit(444444);
	account2.withdraw(5000);
	System.out.println(account1.numberOfTransactions);
	System.out.println(account2.numberOfTransactions);
	account1.transfer(account2, 2000);
	/*switch (acc)
	{
		case 1:
			System.out.printf("Enter the deposit amount:\n");
			amount1 = input.nextDouble();
			account1.deposit(amount1);
			System.out.printf("Your current balance: $%f \n",account1.getBalance());
		
			System.out.printf("Enter the withdrawl amount:\n");
			amount2 = input.nextDouble();
			if(amount2<=account1.getBalance())
			{account1.credit(amount2);}
			System.out.printf("Your current balance: $%f \n",account1.getBalance());
		
			System.out.println("enter the amount to be transfered:");
			amount=input.nextDouble();
			account1.transfer(amount,0);
			account2.transfer(0,amount);

			System.out.printf("Your current balance: $%.2f in account1 and $%.2f in account2 \n",account1.getBalance(),account2.getBalance());
			System.out.printf("no. of transactions: %d",account1.attempts());
			break;
			
			
		case 2:
			System.out.printf("Enter the deposit amount: \n");
			amount1 = input.nextDouble();
			account2.deposit(amount1);
			System.out.printf("Your current balance: $%f \n",account2.getBalance());
		
			System.out.printf("Enter the withdrawl amount: \n");
			amount2 = input.nextDouble();
			if(amount2<=account2.getBalance())
			{account2.credit(amount2);}
			System.out.printf("Your current balance: $%f \n",account2.getBalance());
			
			System.out.println("enter the amount to be transfered:");
			amount=input.nextDouble();
			account2.transfer(amount,0);
			account1.transfer(0,amount);
		
			System.out.printf("Your current balance: $%.2f in account1 and $%.2f in account2 \n",account1.getBalance(),account2.getBalance());			
			System.out.printf("no. of transactions: %d",account2.attempts());
			break;
			
		default: System.out.println("no such account exists");
				
	}*/
	
}
}
