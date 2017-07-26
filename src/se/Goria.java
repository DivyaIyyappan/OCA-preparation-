package se;

public class Goria 



{
static int count;
public static void meth()   //static method
{
	count++;  //static variable can access in static method
}
public void meth1()    //non static method
{
	count++; //static variable can also access in non static method
	meth(); 
}

public void meth2() //non static method
{
	meth();
	meth1();
	meth3();
}
public static  void meth3() //static method 
{
	meth();   //this is static method so we can access in static method
   // meth1();   //this is not a static method  so we cannot access in static method
   // meth2();   //like meth1()
}
public int total;

//public static int avg=total/count;   //total is not static variable so we cannot access in static variables



}
