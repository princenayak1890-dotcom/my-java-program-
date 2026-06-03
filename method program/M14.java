import java.util.*;
class Test
{
	static int add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two nos ");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		int s=no1+no2;
		return s;
	}
	public static void main(String arg[])
	{
          int res=add();
          System.out.println("sum="+res);
	}
}