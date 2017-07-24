package se;

public class Mouse {
	static int MAX_LENGTH = 5;
	  static int length;
	
	 public  static void grow(int inches) {
 if (length < MAX_LENGTH) {
	 int newSize = length + inches;
	 length = newSize;
	 System.out.println(length);
	 }
	 }
	 public static void main(String[] args) {
		Mouse name = new Mouse();
		name.grow(5);

	}
	
}
