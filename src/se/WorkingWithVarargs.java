package se;

public class WorkingWithVarargs {
	 public static void walk(int a,int b,int... nums) {
	 System.out.println(nums.length);
	 }
	 public static void main(String[] args) {
	 walk(1,0); // 0
	 walk(1, 2); // 1
	 walk(1, 2, 3); // 2
	 walk(1,2,3,4,5); // 2
	}
}
