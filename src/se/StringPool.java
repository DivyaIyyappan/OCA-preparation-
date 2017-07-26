package se;

public class StringPool {
	public static void main(String[] args) {
		
	
	// String x = "java";
	// String s = "java";
	 
	 StringBuilder s = new StringBuilder("java");
	 StringBuilder s1 = new StringBuilder("java");
	 if(s1.equals(s) ) System.out.println("Success");
	 else System.out.println("Failure");
}
	
}
