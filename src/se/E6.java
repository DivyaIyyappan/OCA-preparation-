package se;

public class E6 {
	
	
	public static void dochange(int[] arr)
	{
		
		for(int pos=0;pos<arr.length;pos++)
		{
			arr[pos]=arr[pos]+1;
		}
	}
	
	
	
	public static void main(String[] args) {
		
	
	
	int[] arr  = {10,20,30};
	
	dochange(arr);
	
	for(int x:arr)
	{
		System.out.println(x+",");
	}
//	dochange(arr[0],arr[1],arr[2]);
	System.out.println(arr[0]+","+arr[1]+","+arr[2]+",");

}
	
	
	
}