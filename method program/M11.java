import java.util.Scanner;
class M11
{
	static void add(int x,int y)
	{
		int s=x+y;
		System.out.println("sum="+s);
	}

	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two nos ");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
   			add(no1,no2);

	}
}