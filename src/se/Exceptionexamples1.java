package se;

public class Exceptionexamples1 {
	void method()
	{
try
{
	System.out.println("try started");
	fall();
}
catch(RuntimeException e)
{
System.out.println("catch block");	
}
finally{
	System.out.println("finally block always execute");
}
	
	}
 void fall() {
	 throw new RuntimeException();
		
	}
 public static void main(String[] args) {
	 Exceptionexamples1 o=new Exceptionexamples1();
	
	 o.method();
	 
	 
	o.fall();
}
}
