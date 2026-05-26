import java.util.Scanner;
class Else13
{
		public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int no=sc.nextInt();
		String msg;
		msg=no%2==0?"even no":"odd no";
		System.out.println(msg);
	}
}