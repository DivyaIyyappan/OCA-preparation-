package se;

public class Example6 {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder("JAVA");
	StringBuilder sb1=new StringBuilder("JaVa");
	StringBuilder sb2=new StringBuilder("2697");
	StringBuilder a=sb1.insert(0,"j");
	StringBuilder b=sb.insert(0, "SQL");
	StringBuilder c=sb2.insert(0, 0);
	System.out.println(c);
	StringBuilder d=sb2.insert(2, 0);
	System.out.println(d);
	StringBuilder e=sb2.insert(4, 1);
	System.out.println(e);
	StringBuilder f=sb2.insert(5, 9);
	System.out.println(f);
	System.out.println(a);
	System.out.println(b);
	
}
}
