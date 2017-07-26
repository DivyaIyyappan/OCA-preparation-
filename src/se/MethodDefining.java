package se;

public class MethodDefining {
	
	
	
	
	
	//using public access specifier
public void meth() {
	int a=10;
	int b=10;
	int c=a+b;
	System.out.println(c);

}

//using private access specifier
private void meth1() {
	String s="dolly";
	String s1="divya";
	if(s1==s)
	{
		System.out.println("true");
		
	}
	else
	{
		System.out.println("false");
	}
	
}
	
	//using protected
		protected  void meth3(){
			StringBuilder sb=new StringBuilder("divya");
			StringBuilder sb1=new StringBuilder("divya");
			if(sb.equals(sb1))
					{
				System.out.println("equalMethod");
		}	
		
	
	
}



















}
