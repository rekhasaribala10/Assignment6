package Assignment6;

public class Account {
	
	protected String firstName;
	protected String lastName;
	protected double curBalance;
	
	public Account(String fname, String lname, double cb)
	{
		firstName = fname; lastName = lname; curBalance = cb;	
	}
	
		public String getAcctType() 
		{
			return this.getClass().getName();		
		}
		
	public double DebitTransaction(double debitAmount)
	{
		curBalance = curBalance - debitAmount;
		return curBalance;
	}
	
	public double CreditTransaction(double creditAmount) 
	{
		curBalance = curBalance + creditAmount;
		return curBalance;
	}
	
	public String toString()
	{
	 return "Account name: " + firstName + " " + lastName + ", Account Type: " + getAcctType() + ", Balance: " + String.format("$%.2f", curBalance);
		
	}
	
	public static void main(String[] args)
    {
        Account ac1 = new Account("John", "Smith", 100);
        System.out.println(ac1);


        ac1.DebitTransaction(30.25); // should be $69.75
        System.out.println(ac1);


        ac1.CreditTransaction(10.10);
        System.out.println(ac1); // should be $79.85
    }

}
