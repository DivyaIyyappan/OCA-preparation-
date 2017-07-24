package se;

final class Imutable {
	private static String s = "name";
	public String getS() 
	{
		return s;
		}
	public static void main(String[] args) {
		Imutable name = new Imutable();
		name.getS();
		System.out.println(s);
		
	}
}
