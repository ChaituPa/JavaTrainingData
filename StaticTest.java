class Employee
{
	String empName;
	String empCode;
	double sal;
	static int increment;
	static int splAll;
	
	
	public Employee(String empName, String empCode, double sal) {
		super();
		this.empName = empName;
		this.empCode = empCode;
		this.sal = sal;
	}
	
	void giveSplAll(double allowance)
	{
		++splAll;
		setSal(getSal()+allowance);
		
	}
	void changeSalary (double upraisal ) {
		++increment;
		setSal(getSal()+getSal()*upraisal);
	}


	@Override
	public String toString() {
		return "Salary [empName=" + empName + ", empCode=" + empCode + ", sal=" + sal + "]";
	}
	
	void display() {
		System.out.println("Employee Name:"+empName+"\nEmployee Code: "+empCode+"\nSalary : "+sal);
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
	
}
public class StaticTest {

	public static void main(String[] args) {
		System.out.println("The details of the new Salary is updated below: ");
		System.out.println("-----------------------------------------------");
		System.out.println("The increment given is: "+Employee.increment+" times");
				
		Employee s1= new Employee("Anant","1001", 50000);
        System.out.println("The increment given is: "+Employee.increment+" times");
        s1.display();
        
        s1.changeSalary(0.10);
        System.out.println("The increment given is: "+Employee.increment+" times");
        s1.display();
        
        s1.changeSalary(0.20);
        System.out.println("The increment given is: "+Employee.increment+" times");
        s1.display();
        
        s1.changeSalary(0.30);
        System.out.println("The increment given is: "+Employee.increment+" times");
        s1.display();
        
        s1.changeSalary(0.40);
        System.out.println("The increment given is: "+Employee.increment+" times");
        s1.display();
        
        s1.changeSalary(0.50);
        System.out.println("The increment given is: "+Employee.increment+" times");
        s1.display();
		s1.giveSplAll(5000);
		
		
        
        System.out.println("-----------------------------------------------");
      
        Employee s2= new Employee("Krishna","9001", 100000);
        s2.display();    
	}

}
