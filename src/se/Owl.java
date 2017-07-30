package se;

public class Owl implements Noctural{
public boolean isBlind()
{
	return false;
}
public static void main(String[] args) {
	//Noctural name = new Noctural();
	Noctural noc=(Noctural)new Owl();
	System.out.println(noc.isBlind());
}
}
