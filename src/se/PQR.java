package se;

public class PQR {
	PQR(int c,int b,int d)
	{
		
		System.out.println("hi");
	}
	PQR(int a,int b)
	{
		this(2,7,4);
		System.out.println("hlo");
	}
	
	public static void main(String[] args) {
		PQR name = new PQR(2,3);
	}
	
}
