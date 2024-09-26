package java_package;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] num=new int[2][3];
		
		num[0][0]=10;
		num[0][1]=20;
		num[0][2]=30;
		
		num[1][0]=50;
		num[1][1]=60;
		num[1][2]=70;
		
	for(int i=0;i<num.length;i++)
	{
		System.out.println(num[i].length);
		for(int j=0;j<num[i].length;j++)
		{
			System.out.println(num[i][j]);
		}
	}
	}

}
