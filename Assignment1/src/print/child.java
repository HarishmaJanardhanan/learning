package print;

public class child extends parent
{
	
	public static void main(String[] args)
	{
		child z=new child();
		z.square();

	}

	
	public void square() 
	{
		int s=6;
		System.out.println("Area of square: "+s*s);
	}

}
