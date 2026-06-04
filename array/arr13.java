import java.util.Scanner;
class Arr13
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  how many element store in array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter"+size+" elements ");
		int index;
		for(index=0;index<size;index++)  
		{
			 arr[index]=sc.nextInt();
		}
		int s=0;
		System.out.println("elements are ");
		for(index=0;index<size;index++)
		{
			s=s+arr[index];
		}
		System.out.println("sum of element="+s);


	}
}