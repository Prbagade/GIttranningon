package logical_problam;

public class Factorial_Num {

	public static void main(String[] args) 
	{
		int num =5;
		int res=1;
		
		for(int s=1;s<=num;s++) //1 2 3 4 5 
		{
			res=res*s; // 1*1 =1 1*2=2 2*3=6 6*4=24 24*5 =120
		}
		System.out.println("factor of "+num+" is "+res);
	
	}
}
