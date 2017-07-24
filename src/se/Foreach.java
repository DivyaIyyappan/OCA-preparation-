package se;

public class Foreach {
	public static void main(String[] args) {
		//type1
	
 String[] names = new String[3];
	names[0] = "Lisa";	
	names[1] = "Kevin";
    names[2] = "Roger";
	for(String name : names) {
	System.out.print(name + ", ");
	}
		
		
		
		
		//type2
		
		java.util.List<String> values = new java.util.ArrayList<String>();
		values.add("Lisa");
		values.add("Kevin");
		values.add("Roger");
		for(String value : values) {
		System.out.print(value + ", ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//type3
//		String names1 = "Lisa";
//		for(String name : names1) { // DOES NOT COMPILE
//		System.out.print(name + " ");
//		}
//	
		
		
		
		
	
		
		
		
		//type4
		
//		String[] names2 = new String[3];
//		names2[0]="divya";
//		names2[1]="diya";
//		
//		for(int name : names) { // DOES NOT COMPILE
//		System.out.print(name + " ");
//		}
		
		
}
}
