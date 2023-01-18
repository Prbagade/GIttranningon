package control_statement;

public class else_if {

	public static void main(String[] args) 
	{
		int marks =75;
		
		if(marks>=69) 
		{
			System.out.println("student is passed");
		}
		else if(marks >=40 && marks <=59)
		{
			System.out.println("student is fail");
		}
		else if (marks >=60 || marks <=80 ) 
		{
			System.out.println("student is pass");
		}
		System.out.println("++++++thank you++++++");
	
	}

}
