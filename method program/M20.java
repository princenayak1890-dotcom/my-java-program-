import java.util.*;
class M16
{
	static double sical(double p,double r,int t)
	{
		
		double si=p*r*t/100;
		return si;
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter p");
		double p=sc.nextDouble();
		System.out.println("enter r");
		double r=sc.nextDouble();
		System.out.println("enter t");
		int t=sc.nextInt();
	double si=sical(p,r,t);
	System.out.println("si="+si);
    }
}