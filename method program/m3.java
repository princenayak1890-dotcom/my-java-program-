import java.util.Scanner;
class M3
{
	static void check()
	{
		Scanner sc=new Scanner(System.in);
	   System.out.println("enter a number");
	   int no=sc.nextInt();
	   if(no%2==0)
	   {
	   	System.out.println("even number");
	   }
	   else 
	   	{
	   		System.out.println("odd number");
	   	}
   
    }

	public static void main(String arg[])
		  {
		     check();
		  }
}

