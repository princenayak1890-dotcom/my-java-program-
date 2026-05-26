import java.util.Scanner;
class Else9
{
		public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int no1=sc.nextInt();
		System.out.println("enter another number");
		int no2=sc.nextInt();
		if (no1==no2)
			System.out.println("both are same");
		else 
			System.out.println("different no");
	}
}