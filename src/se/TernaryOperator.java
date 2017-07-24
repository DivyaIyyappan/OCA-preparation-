package se;

public class TernaryOperator {
	static int y = 4;
	static int x = (y > 5) ? (2 * y) : (3 * y);
	
	public static void main(String[] args) {
		System.out.println(y);
		System.out.println(x);
		System.out.println((y > 5) ? 21 : "Zebra");
		
	}
}
