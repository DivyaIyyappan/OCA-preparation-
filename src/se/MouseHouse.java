package se;

public class MouseHouse {
	
		private final static  int volume=30;
		private final String name = "The Mouse House";
		
		
		
		
		public MouseHouse(int length, int width, int height) 
		{
		 int volume = length * width * height;
		 System.out.println(volume);
		}
		
public static void main(String[] args) {
	MouseHouse name = new MouseHouse(10,3,2);
	System.out.println(volume);
	
}
}


