import java.util.Scanner;
class Arr15
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int[] marks= new int[5];
		int sum=0;
		System.out.println("enter marks of 5 subject");
			for(int i=0;i<5;i++)
			{
				marks[i]=sc.nextInt();
				sum+=marks[i];
			}
			int average=sum/5;
			System.out.println("average="+average);
		

	}
}