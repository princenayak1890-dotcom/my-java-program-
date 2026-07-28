class Employee
{
	String name;
	int age;
	int empid;
	double salary;
	int mobilenumber;
}
class EmployeeTest
  {
  	public static void main(String arg[])
  	{
  		Employee e=new Employee();
  		e.name="muna";
  		e.age=23;
  		e.empid=123;
  		e.salary=45000;
  		e.mobilenumber=993747;
  		System.out.println("emp name="+e.name);
  		System.out.println("emp age="+e.age);
  		System.out.println("emp id="+e.empid);
  		System.out.println("emp salary="+e.salary);
  		System.out.println("emp mobilenumber="+e.mobilenumber);
  	}
  }