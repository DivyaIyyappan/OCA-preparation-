package se;


public class LambdaExpressionExample {
    public static void main(String[] args) {  
        int width=10;  
        Drawable d1= a->{
        	System.out.println("Drawing..");
        	};
        d1.draw(width);
        disp((a)->{
        	System.out.println("Drawing");
        });
          
    }
    
    static void disp(Drawable d){
    	
    }
}  



