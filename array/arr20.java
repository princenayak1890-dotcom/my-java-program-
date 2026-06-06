class Arry22
{
	public static void main(String arg[])
	{
		int arr[][];
		arr=new int[2][3];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		int i,j;
		for(i=0;i<2;i++)
		{
		for(j=0;j<3;j++)
		{
	  	System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
		}
	}
}