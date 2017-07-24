package se;

public class While {

	int roomInBelly = 5;
	public void eatCheese(int bitesOfCheese) {
		while (bitesOfCheese > 0 && roomInBelly > 0)   //condition
		{
			System.out.println(bitesOfCheese);
			System.out.println(roomInBelly);
		bitesOfCheese--;
		roomInBelly--;
		System.out.println(bitesOfCheese);
		System.out.println(roomInBelly);	
		
	}
		System.out.println(bitesOfCheese);
		System.out.println(roomInBelly);
	}
public static void main(String[] args) {
	While name = new While();
	name.eatCheese(2);

	
}
}
