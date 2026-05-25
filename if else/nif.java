import java.util.Scanner;
class Nif
{
    public static void main(String arg[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int no=sc.nextInt();
        if(no>9)
        {
             if(no<100)
             {
                 System.out.println("2 digit number ");
             }
        }
    }
}
