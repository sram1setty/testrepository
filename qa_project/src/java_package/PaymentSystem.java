package java_package;

public class PaymentSystem {

	
	public void payemntexecute(int amt)
	{
		System.out.println("Process the amount "+amt);
	}
	public void paymentexecute(int amt, String currency)
	{
		System.out.println("Process the maount with currency "+amt+ " "+currency);
	}
	public static void main(String[] args) {
		// Compile- time polymorphism
		PaymentSystem obj= new PaymentSystem();
		obj.payemntexecute(1000);
		obj.paymentexecute(1000 ,"USD");
		
		// Runtime Poylmorphism 
		Payment pay;
		pay=new CreditCard();
		pay.processPayemt();
		
		pay= new PayPal();
		pay.processPayemt();

		pay=new bankTransfer();
		pay.processPayemt();
	}

}


class Payment 
{
	void processPayemt()
	{
		System.out.println("Prrocessing the general payment ");
	}
}

class CreditCard extends Payment
{
	void processPayemt()
	{
		System.out.println("The payment through credit card");
	}
}
class PayPal extends Payment
{
	void processPayemt() {
		System.out.println("The payment through paypal");
	}
	
}
class bankTransfer extends Payment
{
	void processPayemt()
	{
		System.out.println("The payemnt through bank");
	}
}