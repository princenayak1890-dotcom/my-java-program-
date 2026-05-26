import java.util.Scanner;
class Else12
{
		public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int no=sc.nextInt();
		String Msg;
		Msg=no>=0?"+ve no":"-ve no";
		System.out.println(Msg);
	}
}