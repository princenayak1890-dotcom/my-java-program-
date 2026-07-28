class Employee
{
	String name;
	int age;
	int empid;
	double salary;
	long mobilenumber;
	Employee(String n,int a,int e,double s,long m)
	{
		this.name=n;
		this.age=a;
		this.empid=e;
		this.salary=s;
		mobilenumber=m;
	}
	void display()
	{
			System.out.println("emp name="+this.name);
  		System.out.println("emp age="+this.age);
  		System.out.println("emp id="+this.empid);
  		System.out.println("emp salary="+this.salary);
  		System.out.println("emp mobilenumber="+mobilenumber);
	}
}
class EmployeeTest2
  {
  	public static void main(String arg[])
  	{
  		Employee e=new Employee("muna",23,123,45000,993747l);
  		e.display();

  		Employee e1=new Employee("kuna",33,223,35000,994547l);
  		e1.display();

  		Employee e2=new Employee("tuna",43,323,55000,996747l);
  		e2.display();

  	
  	}
  }