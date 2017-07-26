package se;

public class PassByValue {

	public static void swap(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
	}
	
	public static void main(String[] args) {
	
		
		int ori1=10;
		int ori2=20;
		System.out.println(ori1);
		System.out.println(ori2);
		PassByValue.swap(ori1,ori2);
		System.out.println(ori1);
		System.out.println(ori2);
		
		
		
	}
}
