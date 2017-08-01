package se;

public class ExceptionExamples{
ExceptionExamples()
{
	try
	{
		fall();
		System.out.println("never get");
		
	
	}
	catch(RuntimeException re)
	{
		System.out.println("catch");
	}
}
 void fall() {
	throw new RuntimeException();
		
	}
public static void main(String[] args) {
	ExceptionExamples name = new ExceptionExamples();
	name.fall();
}	
}
