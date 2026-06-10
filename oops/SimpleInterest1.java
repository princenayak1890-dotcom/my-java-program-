class SimpleInterest1
{
	private double principal,rate,time;
	SimpleInterest1()
	{
		principal=0;
		rate=0;
		time=0;
	}
	SimpleInterest1(double principal,double rate,double time)
	{
		this.principal=principal;
		this.rate=rate;
		this.time=time;
	}
	void setPrincipal(double pricipal)
	{
		this.principal=principal;
	}
	void setRate(double rate)
	{
		this.rate=rate;
	}
	void setTime(double time)
	{
		this.time=time;
	}
	double getPrincipal()
	{
		return this.principal;
	}
	double getRate()
	{
		return this.rate;
	}
	double getTime()
	{
		return this.time;
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
class SimpleInterest2
{
	public static void main(String arg[])
	{
		SimpleInterest1 s=new SimpleInterest1(12000,4,6);
		s.setPrincipal(40000);
		System.out.println("principal="+s.getPrincipal());
		s.display();
		double res=s.si();
		System.out.println("interset="+res);
	}
}