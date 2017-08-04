package visitors;

public class PhoneNumber {
private static char[] fullphno;

public static String hidephone(String fullphno)
{
	//return new StringBuilder(fullphno).append("xxxx", 8, 12).toString();
	return new StringBuilder("xxxx").append(fullphno, 0, 8).toString();

	
}
	
public static void main(String[] args) {
	PhoneNumber.hidephone("1234567890");
	System.out.println(fullphno);
}	
}
