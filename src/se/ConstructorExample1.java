package se;

public class ConstructorExample1 {
	int a,b,c;
	ConstructorExample1 (int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public static void main(String[] args) {
		ConstructorExample1  name = new ConstructorExample1 (20,30,40);
System.out.println( name.a);
System.out.println(name.b);
System.out.println(name.c);
System.out.printf(name.a+ "",name.b+ "",name.c+ "");

	}
	
}
