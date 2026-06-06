class arry27
{
	public static void main(String arg[])
	{
		int A[][]={{1,2,3},{4,5,6}};
		int B[][]={{7,8,9},{3,4,5}};
		int C[][]=new int[2][3];
		int i,j;
		for( i=0;i<2;i++)
		{
			for( j=0;j<3;j++)
			{
				C[i][j]=A[i][j]+B[i][j];
			}
		}
			System.out.println("sum of matrices:");
			for(i=0;i<2;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.print(C[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
