class SimpleInterest
{
	double principal,rate,time;
	SimpleInterest()
	{
		principal=0;
		rate=0;
		time=0;
	}
	SimpleInterest(double principal,double rate,double time)
	{
		this.principal=principal;
		this.rate=rate;
		this.time=time;
	}
	void display()
	{
		System.out.println("principal="+principal);
		System.out.println("rate="+rate);
		System.out.println("time="+time);
	}
	double si()
	{
		return(principal*rate*time/100);
	}
}
class SimpleInterest1
{
	public static void main(String arg[])
	{
		SimpleInterest s=new SimpleInterest(12000,4,6);
		s.display();
		double res=s.si();
		System.out.println("interset="+res);
	}
}