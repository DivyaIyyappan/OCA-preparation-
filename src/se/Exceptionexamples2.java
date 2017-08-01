package se;

public class Exceptionexamples2  {
	String s="";
	{
		
		try
		{
			s+="t";
		}
		catch(RuntimeException e)
		{
			s+="c";
		}
		finally
		{
			s+="f";
		}
		s+="a";
		
	}

public static void main(String[] args) {
	Exceptionexamples2 name = new Exceptionexamples2();
	System.out.println(name.s);
}
	
}
