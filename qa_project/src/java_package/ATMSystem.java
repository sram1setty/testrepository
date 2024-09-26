package java_package;

public class ATMSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankATM obj=new BankATM();
		obj.checkBalance();
		obj.withdrawMoney(500);
	}

}


abstract class ATM
{
	// No implementation
	abstract void checkBalance();
	abstract void withdrawMoney(int amt);
	void AcctHolder()
	{
		System.out.println("The account holder name is Sravani");
	}
	
}

class BankATM extends ATM
{
	int balance =1000;
	@Override
	void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("The current balance $"+balance);
	}

	void withdrawMoney(int amt) {
		// TODO Auto-generated method stub
		if(amt<=balance)
		{
			balance=balance-amt;
			System.out.println("The amount to withdraw $"+amt);
			System.out.println("Teh reamining amount is $"+balance);
		}
	}
	

}