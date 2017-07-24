package se;

public class Instance {
public static void main(String[] args) {
	Instance name = new Instance();
	
	Object o= new Object();
	System.out.println(name instanceof Object );
	System.out.println(name instanceof Instance);
	System.out.println(o instanceof Object);
	System.out.println(o instanceof Object);
}
}
