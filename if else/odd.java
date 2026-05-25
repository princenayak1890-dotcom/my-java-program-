import java.util.Scanner;
class Odd
{
		public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int no=sc.nextInt();
		if(no%2!=0)
		{
			System.out.println("odd number");
		}
	}
}