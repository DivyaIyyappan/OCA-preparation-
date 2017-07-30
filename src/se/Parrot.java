package se;

public class Parrot extends Bird{
public void fly(String fly)
{
	System.out.println("flying like aeroplane");
}
public void eat(String eat){
	System.out.println("eat only vegetables");
}
public static void main(String[] args) {
	Bird obj=new Bird();
	Parrot obj1=new Parrot();
	obj.eat();
	obj.method();
	obj1.eat("eat");
	obj1.fly("hi");
	

}
}
