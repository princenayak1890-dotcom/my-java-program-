import java.util.Scanner;
class Arr11
{
   public static void main(String arg[])
   {
   	Scanner sc=new Scanner(System.in);
		int arr[]=new int[3];
		System.out.println("enter 3 elements ");
		int index;
		for(index=0;index<arr.length;index++)
		{
			 arr[index]=sc.nextInt();
		}

		System.out.println("elements are ");
		for(index=0;index<arr.length;index++)
		{
			System.out.println(arr[index]);
		}

   }
}