package handy.dandy;

public class Tester {
public static void main(String[] args) {
	String names[]=new String[3];
	names[0]="mary brown";
	names[1]="nancy red";
	names[2]="jessy orange";
	try{
		for(String n:names)
		{
			try{
				String pwd=n.substring(0,3)+n.substring(6, 10);
				System.out.println(pwd);
			}
			catch(StringIndexOutOfBoundsException s)
			{
				System.out.println("StringIndexOutOfBoundsException");
			}
		}
	}
	catch(ArrayIndexOutOfBoundsException a)
	{
		System.out.println("ArrayIndexOutOfBoundsException");
	}
}
}
