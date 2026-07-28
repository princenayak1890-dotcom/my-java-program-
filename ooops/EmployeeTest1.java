class Employee
{
	String name;
	int age;
	int empid;
	double salary;
	long mobilenumber;
	void display()
	{
			System.out.println("emp name="+this.name);
  		System.out.println("emp age="+this.age);
  		System.out.println("emp id="+this.empid);
  		System.out.println("emp salary="+this.salary);
  		System.out.println("emp mobilenumber="+mobilenumber);
	}
}
class EmployeeTest1
  {
  	public static void main(String arg[])
  	{
  		Employee e=new Employee();
  		e.name="muna";
  		e.age=23;
  		e.empid=123;
  		e.salary=45000;
  		e.mobilenumber=993747l;
  		e.display();

  		Employee e1=new Employee();
  		e1.name="kuna";
  		e1.age=33;
  		e1.empid=223;
  		e1.salary=35000;
  		e1.mobilenumber=994547l;
  		e1.display();

  	
  	}
  }