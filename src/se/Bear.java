package se;

public class Bear {
protected void finalize()
{
	System.out.println("cleanup");
}
public static void main(String[] args) {
	Bear name = new Bear();
	name=null;
	//System.gc();
}
}
