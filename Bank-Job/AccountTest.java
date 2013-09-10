public class AccountTest {
	public static void main(String[] args){
		FDAccount account1 = new FDAccount(5000,"G.M. Mishra","Gorakhpur, Uttar Pradesh, PIN - 273209",12);
		BankAccount account2 = new BankAccount(2000, "Sudhanshu Mishra", "BITS Pilani Goa Campus, South Goa, Goa, Pin - 403726");
		account1.transfer(account2, 1000);
		account1.toString();
		account1.withdraw(500);
		account1.deposit(1000);
		
		
		}
}