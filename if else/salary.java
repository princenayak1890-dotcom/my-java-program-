import java.util.Scanner;
class Salary
{
		public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a salary");
		double sal=sc.nextDouble();
		double da=0;
		double hr=0;
		if(sal>=5000);
		{
			da=sal*0.2;
			hr=sal*0.3;
		}
		double total=sal+da+hr;
		System.out.println("the basic salary="+sal);
		System.out.println("the da salary="+da);
		System.out.println("the hr salary="+hr);
		System.out.println("the total salary="+total);
	}
}