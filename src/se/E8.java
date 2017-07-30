package se;

import java.util.ArrayList;

public class E8 {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	String[] ab;
	
	try {
		while(true){
			a.add("divya");
			System.out.println(a);
		}
	} catch (RuntimeException re) {
		System.out.println("catch1");
	}
//	catch(Exception e)
//	{
//		System.out.println("catch2"););
//	}
}
}
