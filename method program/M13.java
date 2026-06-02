import java.util.Scanner;
class M13
{
	static void check(int no1)
	{

	   if(no1%2==0)
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

		Scanner sc=new Scanner(System.in);
	   System.out.println("enter a number");
	   int no1=sc.nextInt();
		     check(no1);
		  }
}

