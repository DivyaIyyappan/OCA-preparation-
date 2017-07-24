package se;

public class Reference {
public static void main(String[] args) {
	
	String one;
	String two;
  one=new String("a");
	two=new String("b");
	String three;
	one=two;
	three =new String("one");
	one=null;
	System.out.println(three);
}
}

