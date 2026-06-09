class Rectangle
{
	int len,bre; 
	Rectangle()  
	{ 
	  len=0;
	  bre=0;
	}
	Rectangle(int len,int bre) 
	{
	  this.len=len;
	  this.bre=bre;
	}
	void display()
	{
	   System.out.println("length="+len);
	   System.out.println("breadth="+bre);
	}
    int area()
    {
       return len*bre;
    }
    void perimeter()
    {
        System.out.println("perimeiert="+2*(len+bre));
    }
}

class RectangleTest
{
	public static void main(String arg[])
	{
	    Rectangle r1=new Rectangle(4,5);
	    r1.display();
	    r1.perimeter();
	    System.out.println("area of rectangle="+r1.area());
	}
}