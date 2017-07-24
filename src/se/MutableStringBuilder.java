package se;

public class MutableStringBuilder {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder("Divya");
	sb=sb.append("Iyyappan").append("Neelavathi");
	
	System.out.println(sb);
}
}
