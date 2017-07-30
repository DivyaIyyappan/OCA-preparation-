package se;

public class E1 {
public static void main(String[] args) {
	int array[]={1,2,3,4,5};
	System.arraycopy(array, 2, array, 1, 2);
	System.out.println(array[0]);
	System.out.println(array[1]);
	System.out.println(array[2]);
	System.out.println(array[3]);
	System.out.println(array[4]);
	
}
}
