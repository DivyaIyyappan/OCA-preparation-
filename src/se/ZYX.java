package se;

public class ZYX  extends XYZ{
ZYX(int age ,int age1)
{
	super(age,age1);
	System.out.println("child");
}


@Override
	public void meth() {
		System.out.println("child method called");
		super.meth();
	
	}

public static void main(String[] args) {
	XYZ name = new XYZ(9,8);
	ZYX name1=new ZYX(9,7);
	XYZ name2=new ZYX(8,0);
	//ZYX name3=new XYZ(6,9);
	name.meth();
	name1.meth();
	name2.meth();
	
}
}
