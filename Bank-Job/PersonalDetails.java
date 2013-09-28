
public class PersonalDetails implements java.io.Serializable
{	static final long serialVersionUID = 0;
	private String name;
	private String address;
	PersonalDetails(String name,String address)
	{
		this.name =""+name;
		this.address = ""+address;
	}
	public String toString()
	{
		return "\nName:"+name+"\nAddress"+address;
	}
}
