package se;

public class Finalizer {

	@Override
	public void finalize()
	{
	System.out.println("hi");
	}
public static void main(String[] args) {
	//Demo1 name = new Demo1();
	Finalizer name1 = new Finalizer();
	Finalizer name2 = new Finalizer();
	name1=null;
//	name2=null;
    System.gc();
}
}
