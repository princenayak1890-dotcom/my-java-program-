class Square1
{
	private int side; 
	Square1()  
	{ 
	  side=0;
	}
	Square1(int side) 
	{
	  this.side=side;
	}
	void setSide(int side)
	{
		this.side=side;
	}
	int getSide()
	{
		return this.side;
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

class SquareTest1
{
	public static void main(String arg[])
	{
	    Square1 r1=new Square1(10);
	    r1.setSide(20);
	    System.out.println("side="+r1.getSide());
	    r1.display();
	    r1.perimeter();
	    System.out.println("area of square="+r1.area());
	}
}