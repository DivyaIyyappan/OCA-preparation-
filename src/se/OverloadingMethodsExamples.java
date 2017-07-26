package se;

public class OverloadingMethodsExamples {
public static void method (int a,int b) //similar datatypes
{
	int c=a+b;
	System.out.println(c);
}
public static void method(int a, int b,int c) // argument count
{
	int d=a+b+c;
	System.out.println(d);
}
public static void method(int a,float b) //disimilar datatypes
{
	float c=a+b;
	System.out.println(c);
}
public static void main(String[] args) {
method(20,20)	;
method(20,20,20);
method(2, 2.89f);

}
}
