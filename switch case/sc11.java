import java.util.Scanner;
class Sc11
{
     public static void main(String arg[])
     {
          Scanner sc=new Scanner(System.in);
        
          System.out.println("enter your choice\n1.square\n2.rectangle\n3.circle");
          int ch=sc.nextInt();
         switch(ch)
         {
          case 1:

          System.out.println("enter square  side ");
          int s=sc.nextInt();
          System.out.println("area of square="+s*s);
          break;
         
           case 2:
               System.out.println("enter the length");
               int l=sc.nextInt();
               System.out.println("enter the breadth");
               int b=sc.nextInt();
               System.out.println("area of the rectangle="+l*b);break;
         
          case 3:
               System.out.println("enter radius");
               double r=sc.nextDouble();
               double areaofcircle=3.14159*r*r;
               System.out.println("area of circle="+areaofcircle);break;
         
          default:  System.out.println("invalid choice");break;
          }
          
     }
}