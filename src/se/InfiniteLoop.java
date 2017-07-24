package se;

public class InfiniteLoop {
static int x=1;
static int y=5;
public  void meth() {
while(true){
	
	y++;
	System.out.println(x);
	break;
}

}
public static void main(String[] args) {
 InfiniteLoop name = new InfiniteLoop ();
 name.meth();

	//System.out.println(y);
}
}
