package se;

public class Food {
public void eatmore(boolean hungry ,int amountoffood)
{
	int roominbelly=5;
	if(hungry)
	{
//boolean timetoeat=true;
		while(amountoffood>0)
		{
			int foodeaten=2;
			{
				roominbelly=roominbelly-foodeaten;
				foodeaten=amountoffood-foodeaten;
				System.out.println(amountoffood);
				System.out.println(roominbelly);
				System.out.println(foodeaten);
			}
		}
		
	
		//System.out.println(amountoffood);
		
	}
	else
	{
		System.out.println("no op");
	}
	
}



public static void main(String[] args) {
	Food name = new Food();
	name.eatmore(true, 2);
}
}
