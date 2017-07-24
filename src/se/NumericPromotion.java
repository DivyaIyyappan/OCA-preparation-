package se;

public class NumericPromotion {
	public static void main(String[] args) {
		
	
//rule 1
	int a=1;
	long b=33l;
	long c=a+b;
	System.out.println(c);
	
	
	
	
	//rule 2
	
	double d=39.21;
	float e=2.11f;
	double f=d+e;
	System.out.println(f);
	
	
	
	//rule3
	short g=10;
	short h=3;
	int i=g/h;
	System.out.println(i);
	
	
	//rule4
	short j=14;
	float k=13;
	double l=15;
	double m= j*k/l;
	System.out.println(m);
	
	
	
	
	
}
}
