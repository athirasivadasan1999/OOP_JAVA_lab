import java.util.*;
interface Sports
{
    void get_details();
    void show_details();
}
class Student
{
    String name;
    int rollno;
    double mark1;
    double mark2;

    Student(String n,int r,double m1,double m2)
    {
        name = n;
        rollno = r;
        mark1 = m1;
        mark2 = m2;
    } 
    void Display()
    {
        System.out.println("--STUDENT DETAILS--");
        System.out.println("Name of the Student : "+name);
        System.out.println("Roll number : "+rollno);
        System.out.println("Mark of subject 1: "+mark1);
        System.out.println("Mark of subject 2: " + mark2);
        System.out.println("percentage of marks : " + ((mark1+mark2)/200)*100 + "%");
    } 
}

class Result extends Student implements Sports
{
    String item;
    int rank;
    Result(String n,int r,double m1,double m2)
    {
        super(n,r,m1,m2);
    }
    void Result_Display()
    {
        super.Display();
    }
    public void get_details()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sports item: ");
        item = sc.nextLine();
        System.out.println("Enter the rank: ");
        rank = sc.nextInt();
    }
    public void show_details()
    {
        System.out.println("----SPORTS DETAILS----");
        System.out.println("Sports Item : " + item);
        System.out.println("Rank : " + rank);
    }
}
public class Result_16
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name : ");
        String n = sc.nextLine();

        System.out.println("Enter Roll no : ");
        int r = sc.nextInt();

        System.out.println("Enter mark 1 :");
        double m1 = sc.nextDouble();

        System.out.println("Enter mark 2 : ");
        double m2 = sc.nextDouble();

        Result R = new Result(n,r,m1,m2);
        R.get_details();
        R.Result_Display();
        R.show_details();
    }
}