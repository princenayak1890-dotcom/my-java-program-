import java.util.Scanner;
class Same
{
		public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		if(no1==no2)
		{
			System.out.println("both nos are same");
		}
	}
}