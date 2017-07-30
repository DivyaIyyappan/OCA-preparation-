package se;

public class Dolpinz  extends Fishes{
	Dolpinz(String color,String type)
	{
	super(color,type);
	}
 void method()
{
	System.out.println(getColor());
	System.out.println(getType());
}

public static void main(String[] args) {
	       Dolpinz  obj=new Dolpinz("yellow","danger");
	  
obj.method();
}
}
