import java.util.*;
class m15
{
	static double add(double no1,double no2,double no3)
	{
	
	double s=no1+no2+no3;
	return s;
    }
    public static void main(String arg[])
    {
    	Scanner sc=new Scanner(System.in);
	System.out.println("enter three nos");
	double no1=sc.nextDouble();
	double no2=sc.nextDouble();
	double no3=sc.nextDouble();
    	double res=add(no1,no2,no3);
    	System.out.println("sum="+res);
    }
}