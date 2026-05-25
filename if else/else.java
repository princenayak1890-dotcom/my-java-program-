import java.util.Scanner;
class Else
{
    public static void main(String arg[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        if(num==1 || num==0)
           System.out.println("hi");
       else
          System.out.println("bye");  
     }
 }