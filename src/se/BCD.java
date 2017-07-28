package se;

public class BCD  extends ABC {
	
	
	void meth()
	{
		System.out.println(getAge());
	}
public static void main(String[] args) throws CloneNotSupportedException {
	ABC na=new ABC();
	
BCD name = new BCD ();
BCD nam=(BCD) name.clone();
name.setAge(10);
name.meth();


}
}
//MyObject anotherObject = new MyObject();
//MyObject object = (MyObject) anotherObject.clone();