import java.util.Scanner;
class Nif3
{
    public static void main(String arg[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int no=sc.nextInt();
        //convert -ve to +ve
        if(no<0)
        {
            no=-no;
        }
        //check 2 digit no
        if(no>9 &&no<100)
             {
                 System.out.println("2 digit number ");
             }
        
    }
}
