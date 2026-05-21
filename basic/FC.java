import java.util.Scanner;
class Fc
{
		public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Fahrenheit");
		double F=sc.nextDouble();
		double C=(F-32)*5/9;
		System.out.println("Fahrenheit="+F);
		System.out.println("Celcius="+C);
	}
}