package se;

import java.util.ArrayList;
import java.util.List;

public class Aexample6 {
public static void main(String[] args) {
	List<String> l=new ArrayList<>();
	List<String> li=new ArrayList<>();
	System.out.println(l.equals(li));
	l.add("divya");
	li.add("divya");
	System.out.println(l.equals(li));
	li.add(0,"dolly");
	System.out.println(l.equals(li));
	
	
}
}
