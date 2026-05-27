import java.util.Scanner;
class Elseif3
{
		public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int no=sc.nextInt();
		// convert -ve to +ve
		if(no<0)
		{
			no=-no;
		}
		// check digit
		if(no<10)    //if(no/10==0)
			System.out.println("sd");
		else if(no<100)   //elseif(no/100==0)
			System.out.println("dd");
		else if(no<1000)  //elseif(no/1000==0)
			System.out.println("td");
		else 
			System.out.println("od");
	}
}