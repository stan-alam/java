// fig 3.5

public class Account {

	private String name;

	// constructor initializes name with parameter name
	public Account( String name )
	{
		this.name = name;
	}


 //method to set the name
	public void setName( String name )
	{
		this.name = name;
	}

 //method to retrieve the name
	public String getName()
	{
		return name;
	}

}