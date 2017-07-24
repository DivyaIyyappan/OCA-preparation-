package se;

public class Change {
public static void change(int size,StringBuilder s){
	s.append("b");
	size++;
	}
public static void main(String[] args) {
	int size=2;
	StringBuilder s1=new StringBuilder("s1");
	change(size,s1);
	System.out.println("s1="+s1);
	System.out.println("size="+size);
}
}

