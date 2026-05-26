import java.util.Scanner;
class Else15
{
		public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two nos");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		int big;
		if(no1==no2)
		{
		   System.out.println("all are same number");
		   System.exit(0);
		}
		big=no1>no2?no1:no2;
		System.out.println(big);
	}
}