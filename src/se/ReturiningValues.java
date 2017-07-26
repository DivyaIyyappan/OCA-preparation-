package se;

public class ReturiningValues {
 public static int method(int num)
 {
	 num++;
		 return num;
 }
	
 
 public static String method1(String let)
 {
	 
	 let+="d";
	 return let;
	 
 }
	
	public static void main(String[] args) {
		
		int num=1;
	String let="asdfghjkkl";
	method(num);
let=	method1(let);
System.out.println(num+let);
	
		
		
		
		
	}
	
	
	
}
