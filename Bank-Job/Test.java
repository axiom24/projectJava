import java.io.*;
public class Test {
	
	public static void main(String [] args)
	   {
		  BankAccount[] e = new BankAccount[3];
		  e[0] = new SavingsAccount(5000,"Abc Def","123","4553",5.5);
	      
	      try
	      {
	         FileOutputStream fileOut =new FileOutputStream("/tmp/employee.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e[0]);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in /tmp/employee.ser");
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
	   }
	}


