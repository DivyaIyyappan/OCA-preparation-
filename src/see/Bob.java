package see;

public class Bob {
public static void main(String[] args) {
	Sun o=new Sun();
	Star oo=o;
	((Sun) oo).dostuff();
	((Star)o).dostuff();
	((Universe)o).dostuff();
}
}
