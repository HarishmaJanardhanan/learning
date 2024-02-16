package print;
public class calculate 
{
	public static int sq()
	{
		int side=5;
		int perisquare=4*side;
		return perisquare;
		
	}
	public static void bmi()
	{
		double h=150,w=48;
	    double bmi=(w/(h*h))*10000;
		System.out.println("BMI : "+bmi);
		
	}
	private static double tri()
	{
		double a=3.2,b=5.5,c=6.8;
		double p=a+b+c;
		return p;
	}
	public static void main(String args[])
	{
		System.out.println("Perimeter of square: "+calculate.sq());
		calculate.bmi();
		System.out.println("Perimeter of triangle: "+calculate.tri());
	}

}
