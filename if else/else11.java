import java.util.Scanner;
class Else11
{
		public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a age");
		int age=sc.nextInt();
		if(age>=18)
			System.out.println("eligible for voting");
		else 
			System.out.println("not eligible");
	}
}