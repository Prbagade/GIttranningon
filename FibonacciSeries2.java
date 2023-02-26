package logical_problam;

public class FibonacciSeries2 {
	
	// Addition of first 2 number 
	// 0 1 1 2 3 5 8 13 21......Fibonacci series

	public static void main(String[] args) 
	{
		int first =0;
		int second =1;
		int series =10 ;

		for(int s=first; s<=10; s++) 
		{
		
			System.out.print(first+" ");

			int next= first+second;
			first=second;
			second=next;
								
		}
		
	}

}
