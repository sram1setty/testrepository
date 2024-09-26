package java_package;

public class ExceptionClas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int div=1/0;
		}
		
		catch(Exception e)
		{
			System.out.println("The number is not divisible by zero");
		}
	}

}
