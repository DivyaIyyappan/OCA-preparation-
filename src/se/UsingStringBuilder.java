package se;

public class UsingStringBuilder {
public static void main(String[] args) {
	//String alpha="";...........................normal
	StringBuilder alpha=new StringBuilder();  //Using StringBuilder
	for(char current='a';current<='z';current++)
	{
		//alpha+=current;...................normal
		alpha.append(current);
		
		System.out.println(alpha);
	}
}
}
