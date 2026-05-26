import java.util.Scanner;
class Else14
{
		public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter salary");
		double sal=sc.nextDouble();
		double da,hra,total;
		da=sal>=5000?sal*0.3:sal*0.1;
		hra=sal>=5000?sal*0.2:sal*0.05;
		total=sal+da+hra;
		System.out.println("basic salary="+sal);
		System.out.println("da="+da);
		System.out.println("hra="+hra);
		System.out.println("total="+total);
	}
}