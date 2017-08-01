package se;

public class StringFromChar {
	
	    
	    public static void main(String[] args) {
	        String myStr = "good";
	        char[] myCharArr = {'g', 'o', 'o', 'd' };
	        
	      String myStr1="good";  
	        String newStr = null;
	        for(char ch : myCharArr){
	            newStr = newStr + ch;
	           
	        }
	        System.out.println((myStr1== myStr)+ " " + (myStr1.equals(myStr))); 
	        System.out.println((newStr == myStr)+ " " + (newStr.equals(myStr))); 
	        
	    }
	}

