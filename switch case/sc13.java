import java.util.*;
class sc13
{
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a char ");
      char ch=sc.next().charAt(0);
      if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
      {
          if(ch>='A'&&ch<='Z')
          {
          System.out.println("upper case");
          }
          else
          {
          System.out.println("lower case");
          }
          switch(ch)
          {
            case 'a':case 'A':case 'e':case 'E':
            case 'i':case 'I':case 'o':case 'O':case 'u':case 'U':
            System.out.println("vowel");break;
            default :System.out.println("co");
          }

      }
      else
      {
       System.out.println("not alp");
      }
    }
}