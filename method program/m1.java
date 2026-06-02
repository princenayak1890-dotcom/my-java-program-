import java.util.Scanner;
class Add
{
	static void add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two nos");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		int s=no1+no2;
		System.out.println("sum="+s);
	}

	public static void main(String arg[])
	{
   			add();
   			add();
	}
}