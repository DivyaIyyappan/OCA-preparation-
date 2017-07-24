package se;

public class Variables {

public void hungry(boolean hungry)
{
	if(hungry){
		int bitofcheese=1;
		{
			boolean tinybit=true;
			System.out.println(bitofcheese);
			System.out.println(tinybit);
		}
		//System.out.println(tinybit);
	}
	else
	{
		System.out.println("no output");
	}
}
public static void main(String[] args) {
Variables name = new  Variables();
name.hungry(true);
}
}
