package java_package;

public class BankSystem {
	
	public BankSystem()
	{
		System.out.println("This is a savinf account");
	}
	
	int amt=5000;
	
	public void deposit(int dep)
	{
		amt=amt+dep;
		System.out.println("The amount after deposit "+amt);
	}
	
	public void withdraw(int wt)
	{
		amt=amt-wt;
		System.out.println("the amount after withdraw "+amt);
	}
	
	public int display()
	{
		return amt;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankSystem obj= new BankSystem();
	
		obj.deposit(1000);
		obj.withdraw(2000);
		System.out.println(obj.display());

	}

}
