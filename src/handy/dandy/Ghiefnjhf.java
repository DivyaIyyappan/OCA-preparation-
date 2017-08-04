package handy.dandy;

public class Ghiefnjhf {
	
	

public static void main(String[] args) {
	try{
		int[] arr={100,100};
		dispresult(arr);
	}
	catch(IllegalArgumentException ee)
	{
		System.err.println("second");
	}
	catch(Exception e)
	{
		System.err.println("third");
	}
	
	
}

public static void dispresult(int[] num) {
	try{
		System.out.println(num[1]/num[1]-num[2]);
	
	}catch(ArithmeticException ae)
	{
		System.err.println("first");
	}
	System.out.println("done");
	
}
}
