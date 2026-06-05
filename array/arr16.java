class Arr16
{
	public static void main(String arg[])
	{
		int arr[]={2,3,4,5,6};
		int index;
		int F=arr[0];
		int L=(arr.length-1);
		int sum= F+L;
		System.out.println("sum="+sum);
		if(sum%2==0)
		{
			System.out.println("sum is even");
		}
		else 
		{
			System.out.println("sum is odd");
		}
	}
}