package se;

public class Bandwidth1 {

Boolean bool;
boolean bool1=false;

    public int available = 0;
    public int getAvailable(){
        return available;
    }
    public Bandwidth1(int quota){
        this.available = quota;
    }
    public void addMore(int more){
        available += more;
    }
    
public static void main(String[] args) {
	Runnable t = new Thread();
	Object o = new java.io.File("a.txt");

     Bandwidth1 bw = new Bandwidth1(100);
        //INSERT CODE HERE
         //Bandwidth1 name = new  Bandwidth1();
       bw.available=0;
        bw.addMore(-bw.getAvailable());
     
        System.out.println(bw.getAvailable());

}
}