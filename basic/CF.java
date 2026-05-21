import java.util.Scanner;
class CF
{
		public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter celcius");
		double C=sc.nextDouble();
		double F=(C*9/5)+32;
		System.out.println("celcius");
		System.out.println("Fahreinheit="+F);
	}
}