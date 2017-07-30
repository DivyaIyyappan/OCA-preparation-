package se;

import java.util.ArrayList;
import java.util.List;

public class Aasdertythgf {
public static void main(String[] args) {
	List<Integer> n=new ArrayList<>();
	n.add(20);
	n.add(11);
	n.add(9);
	n.add(15);
	n.add(40);
	System.out.println(n);
	n.remove(4);
	n.removeIf(e->e%2==0);  //
	System.out.println(n);
	
}
}
