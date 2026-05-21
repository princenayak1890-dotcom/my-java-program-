import java.util.Scanner;
class Mark
{
		public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name ");
		String name=sc.nextLine();
		System.out.println("enter a roll no");
		int R=sc.nextInt();
		System.out.println("enter Mark");
		double Mark=sc.nextDouble();
		System.out.println("name="+name);
		System.out.println("roll no="+R);
		System.out.println("mark="+Mark);
	}
}
