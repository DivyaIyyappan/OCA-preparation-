package se;

public class E4 {
	public static void main(String[] args) {
		
	
String[] str=new String[]{"hi","hlo"};
int id=0;


for(String s: str)
{
	str[id].concat("ele");
	System.out.println(str[id].concat("ele"));
	id++;
}
	
for(id=0;id<str.length;id++)
{
	System.out.println(str[id]);

}
}
}
