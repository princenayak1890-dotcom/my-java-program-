class Square
{
	int side; 
	Square()  
	{ 
	  side=0;
	}
	Square(int side) 
	{
	  this.side=side;
	}
	void display()
	{
	   System.out.println("side="+side);
	}
    int area()
    {
       return side*side;
    }
    void perimeter()
    {
        System.out.println("perimeter="+4*side);
    }
}

class SquareTest
{
	public static void main(String arg[])
	{
	    Square r1=new Square(10);
	    r1.display();
	    r1.perimeter();
	    System.out.println("area of square="+r1.area());
	}
}