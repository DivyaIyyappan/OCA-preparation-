package aqua.jellies;

public class SAdaad {
public static void main(String[] args) {
	int a[]={1,2,3,4,5};
	System.arraycopy(a, 2, a, 1, 2);
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
	System.out.println(a[4]);
}
}
