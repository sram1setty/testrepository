package java_package;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50};
		int [] num= new int[5];
		
		num[0]= 20;
		num[1]=30;
		num[2]=40;
		num[3]=50;
		num[4]=60;
		System.out.println(num[0]);
		int sum=0;
		for(int i=0;i<=num.length;i++)
		{
			sum+=num[i];
		}
		System.out.println(sum);

	}

}

