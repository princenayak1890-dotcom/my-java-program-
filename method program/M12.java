import java.util.Scanner;
class M12
{
	    static void sical(double p,double r,int t)
	    {
	    
		double si=p*r*t/100;
		System.out.println("principal="+p);
		System.out.println("interest="+r);
		System.out.println("time="+t);
		System.out.println("simple interest="+si);
	    }
		public static void main(String arg[])
	{
			Scanner sc=new Scanner(System.in);
		System.out.println("enter a p");
		double p=sc.nextDouble();
		System.out.println("enter a interest");
		double r=sc.nextDouble();
		System.out.println("enter time");
		int t=sc.nextInt();
		sical(p,r,t);
	
	}
}