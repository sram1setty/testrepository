package java_package;

public class InheritanceClass implements CustomerDetails{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer obj= new Customer();
		
		obj.displayBankDetails();
		obj.customerDetails();
	}

	@Override
	public void loginCredentials() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accountHolder() {
		// TODO Auto-generated method stub
		
	}

}

class Bank
{
	String bankna="HDFC";
	

	public void displayBankDetails()
	{
		System.out.println("The name of bank "+ bankna);
	}
	
	
}



class Customer extends Bank
{
	String customerName="Sravani";
	int acctno=12234454;
	
	public void customerDetails()
	{
		System.out.println("the anme of customer "+customerName + " "+acctno);
	}
	
	
}