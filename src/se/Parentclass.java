package se;

public class Parentclass {
public static void main(String[] args) {
	Parentclass p=new Parentclass();
	Childclass c=new Childclass();
	p=c;
	//c=p;
	System.out.println("p"+p.getClass());
	System.out.println("c"+c.getClass());
}
}
