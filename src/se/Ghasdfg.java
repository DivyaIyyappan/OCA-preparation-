package se;

public class Ghasdfg {
	public float parseFloat( String s )
	{
		float f = 0.0f; 
		try{ 
			f = Float.valueOf( s ).floatValue();
			return f ;    }  
		catch(NumberFormatException nfe){
			f = Float.NaN ;   
			return f;    
			}   
		finally{
			f = 10.0f; 
			System.out.println(f);  
			}
		}
	public static void main(String[] args) {
		Ghasdfg name = new Ghasdfg();
		name.parseFloat("0.0");
		
	}
}
