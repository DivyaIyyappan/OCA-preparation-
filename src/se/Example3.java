package se;

public class Example3 {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder("Divya Iyyappan Neelavathi");
String b=	sb.substring(0);
String b1=	sb.substring(5);
String b2=	sb.substring(15);
String c= sb.substring(0,5 );
String d= sb.substring(6,15);
String e= sb.substring(15,25 );

System.out.println(b);
System.out.println(b1);
System.out.println(b2);
System.out.println(c);
System.out.println(d);
System.out.println(e);
}
}
