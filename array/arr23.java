import java.util.Scanner;
class arry26
{
	public static void main(String arg[])
	{
				Scanner sc=new Scanner(System.in);
		int mark[][];
		mark=new int[3][4];

		int i,j;
		for(i=0;i<3;i++)
		{
		   System.out.println("enter student "+(i+1));
			for(j=0;j<4;j++)
			{
			    System.out.print("enter mark :"+(j+1));
			     mark[i][j]=sc.nextInt();
			}
		}
		int total=0;
		System.out.println("stud\tm1\tm2\tm3\tm4\ttotal\tavg");
		for(i=0;i<3;i++)
		{
		      System.out.print((i+1)+"\t");
			for(j=0;j<4;j++)
			{
			  System.out.print(mark[i][j]+"\t");
			  total=total+mark[i][j];
			}
			System.out.println(total+"\t"+total/4);
			total=0;
		}
	}
}