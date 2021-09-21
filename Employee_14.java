import java.util.*;
class Employee
{
    protected int Empid;
    protected String Name;
    protected double Salary;
    protected String Address;

    Employee(int id,String name,double salary,String address)
    {
        Empid = id;
        Name = name;
        Salary = salary;
        Address = address;
    }
    void Display()
    {
        System.out.println("---EMPLOYEE DETAILS---");
        System.out.println("Employee Id : " + Empid);
        System.out.println("Employee Name :" + Name);
        System.out.println("Salary : " + Salary);
        System.out.println("Address : " + Address);
    }
}

class Teacher extends Employee
{
    String department;
    String subject_taught;

    Teacher(int id,String name,double salary,String address,String dept,String sub)
    {
        super(id,name,salary,address);
        department = dept;
        subject_taught = sub;
    }
    
    void Display()
    {
        super.Display();
        System.out.println("Department Name : " +department);
        System.out.println("Subject : " + subject_taught);
    }
}

public class Employee_14
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of teachers: ");
        int n = sc.nextInt();
        Teacher T[] = new Teacher[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Employee ID : ");
            int id = sc.nextInt();

            System.out.println("Enter Employee Name : ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Enter Salary : ");
            double salary = sc.nextDouble();

            System.out.println("Enter Address :  ");
            sc.nextLine();
            String address = sc.nextLine();

            System.out.println("Enter Department : ");
            String dept = sc.nextLine();
            
            System.out.println("Enter Subject : ");
            String sub = sc.nextLine();
            T[i] = new Teacher(id,name,salary,address,dept,sub);
        }
        for(Teacher i:T)
        {
            i.Display();
        }
    }
}