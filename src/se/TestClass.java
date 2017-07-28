package se;

public class TestClass {
	

	
	public static void sayHello()
	{ 
		System.out.println("Static Hello World"); 
		}  //2
//public static void sayHello() 
//{ System.out.println("Hello World ");
//}  //3

		   public static void main(String[] args){ 
			   new TestClass().sayHello(); }   //1
		   
		}
