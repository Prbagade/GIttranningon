package control_statement;

public class nested_if_else {

	public static void main(String[] args) 
	{
		String user="abc";
		String pass="xyz";
		
		if(user == "abc") 
		{
			if(pass == "xyz")
			{
				System.out.println("loging is correct");
			}
			else 
			{
				System.out.println("loging is incorrect");
			}
			
			}
		else 
		{
			System.out.println("user incorrect");
				}
		
		}

}
