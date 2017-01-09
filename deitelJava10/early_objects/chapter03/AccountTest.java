// fig 3.6

public class AccountTest {
	public static void main( String[] args)
	{
		Account account1 = new Account("Bubba Smith");
		Account account2 = new Account(" John Doe ");

		//display initial value of name for each Account
		System.out.printf("account1 name is %s%n", account1.getName());
		System.out.printf("account2 name is %s%n", account2.getName());
	}
}