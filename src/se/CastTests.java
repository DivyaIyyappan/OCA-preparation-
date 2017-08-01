package se;

public class CastTests {
public static void main(String[] args) {
	byte b=-128;
	int i=b;
	b=(byte)i;
	System.out.println(i+""+b);
}
}
