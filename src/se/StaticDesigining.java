package se;

public class StaticDesigining {
static int a;
static int b;

public static void method(int a,int b){
	int c=a+b;
	System.out.println(c);
	
}
public void method1(int a,int b)

{
	int c=a-b;
	System.out.println(c);
}

public static void main(String[] args) {
	
	StaticDesigining.method(10,10);//static method called by using classname
	StaticDesigining name = new StaticDesigining();
		name.method1(2, 4);    //non static method called by using object name
	
	


	
}
	
	
}
