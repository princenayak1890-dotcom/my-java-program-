import java.util.*;
class M17
{
	static boolean check()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		if(n%2==0)
			return true;
		 return false;

	}
	public static void main(String arg[])
	{
		if(check())
		{
			System.out.println("even number");
		}
		else 
		{
			System.out.println("odd number");
		}
	}

}