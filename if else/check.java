import java.util.Scanner;
class Check
{
	public static void main (String arg[])
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter a number");
	   int num1=sc.nextInt();
	   System.out.println("enter another number");
	   int num2=sc.nextInt();
	   if(num1==num2)
	      System.out.println("both same");
	   if(num1>num2)
	          System.out.println("1st>2nd");
	   if(num1<num2)
	          System.out.println("2nd>1st");       

	}
}
