package se;

import java.util.Arrays;

public class Aexample3 {
public static void main(String[] args) {
	String[] words=new String[]{"B","G","A"};
	int[] numbers=new int[]{2,3,4,5};
	Arrays.sort(numbers);
	
	Arrays.binarySearch(numbers,5);  // searching 23
	Arrays.sort(words);
	Arrays.binarySearch(words, "A");
	
	
}
}
