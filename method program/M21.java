import java.util.*;
class M17
{
	static boolean check(int n)
	{
		
		if(n%2==0)
			return true;
		 return false;

	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		if(check(n))
		{
			System.out.println("even number");
		}
		else 
		{
			System.out.println("odd number");
		}
	}

}