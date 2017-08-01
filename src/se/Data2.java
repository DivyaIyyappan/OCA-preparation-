package se;

public class Data2 {

	    private int x = 0;
	    private String y = "Y";
	    public Data2(int k){
	        this.x = k; 
	    }
	    public Data2(String k){
	        this.y = k; 
	    }    
	    public void showMe(){
	        System.out.println(x+y);
	    }
	

	    public static void main(String[] args) throws Exception {
	        new Data(10).showMe();
	        new Data("Z").showMe();
	    }
	}
