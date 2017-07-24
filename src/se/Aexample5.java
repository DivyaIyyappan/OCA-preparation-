package se;

import java.util.ArrayList;

public class Aexample5 {
	
	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<>();
		list.add("divya");
		list.add("divyaIyyappan");
		list.add("dollyIyyappan");
		list.remove(2);
		list.set(0, "divyaNeelavathi");
		System.out.println(list.isEmpty());
        System.out.println(list.size());
       System.out.println( list.contains("dollyIyyappan"));
		System.out.println(list);
		
		
		
		
	}

}
