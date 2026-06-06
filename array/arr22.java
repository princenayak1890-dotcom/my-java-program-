class arry24
{
	public static void main(String arg[])
	{
				int arr[][]={{10,20,30},{40,50,60},{70,80,90}};
		int i,j;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
			  System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}