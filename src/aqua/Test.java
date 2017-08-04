package aqua;



class Alpha{
	public String[] main=new String[2];
	Alpha(String[] main)
	{
		for (int i = 0;i<main.length;i++)
			this.main[i]=main[i]+5;
	}
	public void main() {
		System.out.println(main[0]+main[1]);

	}
}
public class Test {
	
public static void main(String[] args) {
	Alpha main = new Alpha(args);
	main.main();
	
}
}

