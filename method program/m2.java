import java.util.Scanner;
class Add
{
	static void add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three nos");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		int no3=sc.nextInt();
		int s=no1+no2+no3;
		System.out.println("sum="+s);
	}

	public static void main(String arg[])
	{
   			
        add();
	}
}