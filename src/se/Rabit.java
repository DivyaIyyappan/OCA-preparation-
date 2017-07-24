package se;

public class Rabit {
	@Override
	public void finalize(){
		System.out.println("cleanup");
	}
	 public static void main(String[] args) {
		
	 Rabit one = new Rabit();
	 Rabit two = new Rabit();
	 Rabit three = one;
	 one = null;
	 Rabit four = one;
	 three = null;
//	 two = null;
//	 two = new Rabit();
	 System.gc();
	 } }

