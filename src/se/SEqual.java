package se;

public class SEqual {
public static void main(String[] args) {
	String str="divya";
	String str1="divya";
	String str2="DIVYA";
	String str3="23";
	String str4="23";
	String str5="45";
	System.out.println("divya".equals("divya"));
	System.out.println("divya".equals("DIVYA"));
	System.out.println(str.equals(str1));
	System.out.println(str1.equals(str2));
	System.out.println(str.equalsIgnoreCase(str2));
	System.out.println(str4.equals(str3));
	System.out.println("23".equals("23"));
	System.out.println(str3.equals(str5));
	System.out.println(Integer.parseInt(str3)<Integer.parseInt(str5));
	String str6="hello";
	System.out.println(str6.replace("h", "H"));
}
}
