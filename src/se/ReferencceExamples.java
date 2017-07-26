package se;

public class ReferencceExamples {
public void fly(String s)
{
	System.out.println("String");
	System.out.println(s);
}
public void fly(Object o)
{
	System.out.println("object");
	System.out.println(o);
}

public static void main(String[] args) {
	ReferencceExamples name = new ReferencceExamples();
	name.fly("divya");
	name.fly(2697);
}

}
