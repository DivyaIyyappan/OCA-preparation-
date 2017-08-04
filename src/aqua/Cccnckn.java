package aqua;

public class Cccnckn {
	
	public static void main(String[] args) throws Exception{
		dos();
		
		
	}
	
public static void	dos() throws Exception
	{
		System.out.println("Before if");
		if(Math.random()>0.5)
		{
			throw new Exception();
		}
		
		
		System.out.println("after if");
	}



}
