package se;

public abstract class ParentAclass {
abstract void method();

public static void main(String[] args) {
	ChildAclass obj=new  ChildAclass();
	obj.method();
}
}
