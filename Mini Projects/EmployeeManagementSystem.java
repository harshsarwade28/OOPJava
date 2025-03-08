
import java.util.*;

public class EmployeeManagementSystem {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee[] e = new Employee[15];
		
		for(int i=0; i<e.length; i++)
		{
			System.out.println("Enter details of employee "+(i+1)+" :");
			
			System.out.println("Enter ID: ");
			int empId=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Name: ");
			String empName=sc.nextLine();
			
			System.out.println("Enter Salary: ");
			int empSalary=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Address: ");
			String empAddress=sc.nextLine();
			
			System.out.println("Enter Number: ");
			int empNumber=sc.nextInt();
			sc.nextLine();
			
			e[i] = new Employee(empId, empName, empSalary, empAddress, empNumber);
			
		}
		
		for(int i=0; i<e.length; i++)
		{
			System.out.println();
			System.out.println("--------------");
			System.out.println("Employee "+(i+1)+" Details: ");
			System.out.println("ID: "+e[i].empId);
			System.out.println("Name: "+e[i].empName);
			System.out.println("Salary: "+e[i].empSalay);
			System.out.println("Address: "+e[i].empAddress);
			System.out.println("Number: "+e[i].empNumber);
			System.out.println("--------------");
		}
	}
}


class Employee{
	
	int empId;
	String empName;
	float empSalay;
	String empAddress;
	int empNumber;
	
	
	Employee(int empId, String empName, float empSalary, String empAddress, int empNumber){
		
		this.empId=empId;
		this.empName=empName;
		this.empSalay=empSalay;
		this.empAddress=empAddress;
		this.empNumber=empNumber;
	}
}