
public class LastTransaction implements java.io.Serializable
{	static final long serialVersionUID = 0;
	private String type;
	LastTransaction(String type)
	{
		this.type =""+type;
	}
	public void updateTransaction(String update)
	{
		type = String.valueOf(update);
	}
	public String toString()
	{
		return "Last Transaction made:"+type;
	}
}
