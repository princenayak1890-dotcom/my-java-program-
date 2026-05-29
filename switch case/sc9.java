import java.util.Scanner;
class Sc9
{
     public static void main(String arg[])
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter a number ");
          int no=sc.nextInt();
          switch(no%2)
          {
          case 0:System.out.println("even no");break;
          default :System.out.println("odd no");
          }
  
     }
}
