import java.util.Scanner;
class Else16
{
		public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int no=sc.nextInt();
		if(no!=0)
		{
				if(no>0)
			{
				System.out.println("+ve number");
			}
			else 
			{
				System.out.println("-ve number");
			}
		}
	}
}