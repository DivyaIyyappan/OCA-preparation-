package se;

public class TestCase {
	

			
			   public void method(Object o){
			      System.out.println("Object Version");
			   }
			   public void method(java.io.FileNotFoundException s){
			      System.out.println("java.io.FileNotFoundException Version");
			   }
			   public void method(java.io.IOException s){
			      System.out.println("IOException Version");
			   }
			   public static void main(String args[]){
			      TestCase tc = new TestCase();
			      tc.method(null);
			   }
			}

