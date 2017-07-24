package se;

public class Mutable {
static private String s="Name";

public String getS() {
	return s;
}

public void setS(String s) {
	this.s = s;
}
	public static void main(String[] args) {
		Mutable name = new Mutable();
		System.out.println(name.getS());	
		name.setS("divya");
		System.out.println(s);
	}
}

