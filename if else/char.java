import java.util.Scanner;
class Char
{
    public static void main(String arg[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a char ");
        char ch=sc.next().charAt(0);
        if(ch>='A')
        {
            if(ch<='Z')
            {
                System.out.println("upper case");
            }
        }
        
    }
}


