
public class Verifier implements java.io.Serializable
{	static final long serialVersionUID = 0;
	private String password;
	private int wrong_Tries;
	private static int max_Tries = 3;
	Verifier(String initial)
	{
		password = ""+initial;
		wrong_Tries = 0;
	}
	public boolean verifyPasssword(Object pass)
	{
		if(password.equals(String.valueOf(pass)))
		{
			System.out.println("Verification Successful");
			wrong_Tries = 0;
			return true;
		}
		else
		{
			wrong_Tries++;
			if(wrong_Tries>=max_Tries)
				accountLock();
			return false;
		}
	}
	public void accountLock()
	{
	
			System.out.println("Account Locked");
	}

}

