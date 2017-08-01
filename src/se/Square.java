package se;

public class Square {
	//byte b=320;
	char c2=234;

	    private static double side = 0;
	    String color;
	    public Square(double length){
	        this.side = length;
	    }
	    public double getSide() {  return side;    }

	    public double setSide(double side) {  this.side = side; 
	    return side;}
	    
	

	    public static void main(String[] args) throws Exception {
	        Square mysq = new Square(10);
	        mysq.color = "red";
	        
	        //set mysq's side to 20
	        side=20;
	        System.out.println(side);
	       // Square.mysq.side = 20;
	        mysq.side = 20;
	      System.out.println( mysq.setSide(20));
	    }
	}

